package com.niit.coolcodersbackend.restcontroller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.niit.coolcodersbackend.dao.Blog_CommentDao;
import com.niit.coolcodersbackend.dao.Blog_MasterDao;
import com.niit.coolcodersbackend.model.Blog_Comment;
import com.niit.coolcodersbackend.model.Blog_Master;





@RestController
public class BlogController {
	
	@Autowired
	Blog_Master blog_master;
	
	@Autowired
	Blog_MasterDao blog_masterDao;
	
	@Autowired
	Blog_Comment blog_comment;
	
	@Autowired
	Blog_CommentDao blog_commentDao;
	
	 @RequestMapping(value = "/blogs", method = RequestMethod.GET)
	    public ResponseEntity<List<Blog_Master>> listAllblogs() {
	        List<Blog_Master> bloglst = blog_masterDao.getAllList();
	        
	        if(bloglst.isEmpty()){
	            return new ResponseEntity<List<Blog_Master>>(HttpStatus.NO_CONTENT);
	            //You many decide to return HttpStatus.NOT_FOUND
	        }
	        return new ResponseEntity<List<Blog_Master>>(bloglst, HttpStatus.OK);
	    }
	 
	 
	 @RequestMapping(value = "/blog/insert/", method = RequestMethod.POST )
	    public ResponseEntity<Void> createUser(@ModelAttribute("blogm") Blog_Master blog_master, @RequestBody Blog_Master blogMaster,   UriComponentsBuilder ucBuilder) {
	           System.out.println("Done Here Blog Storing "+blogMaster.getBtitle());
//	           System.out.println("Done Here Blog Storing "+blog_master.getBtitle());
	           
	           try{
	        blog_masterDao.SaveOrUpdate(blogMaster);
	        System.out.println("3333333333333333333333333333333"+blogMaster.getBtitle());
	           }catch(Exception e){System.out.println("EXPTION......"+e.toString());}
	        HttpHeaders headers = new HttpHeaders();
	        headers.setLocation(ucBuilder.path("/users/{id}").buildAndExpand(blogMaster.getBid()).toUri());
	        System.out.println("444444444444444444444444444444444");
	        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	    }
	 
	 //deleting blog
	
	 @RequestMapping(value = "/blogDel/{bid}", method = RequestMethod.DELETE )
	    public void DelBlog(@PathVariable("bid") int bid) {
	     System.out.println(bid); 
	     System.out.println( bid+""+"Done DellllllllllHere Blog Deleting11111111111 ");
		    boolean flag=blog_masterDao.deleteById(bid); 
	           System.out.println("Done Here Blog Deleting22222222222222");
//	           boolean wasOk=blog_masterDao.deleteById(bid);
	       
	    }   
	       


	 //COMMENTS
	 
	 @RequestMapping(value = "/coments/{bid}", method = RequestMethod.GET)
	    public ResponseEntity<List<Blog_Comment>> listAllComents(@PathVariable("bid") int bid) {
	     System.out.println(bid); 
	     
		 List<Blog_Comment> cmtlst = blog_commentDao.getCmts(bid);
	        
	        if(cmtlst.isEmpty()){
	            return new ResponseEntity<List<Blog_Comment>>(HttpStatus.NO_CONTENT);
	            //You many decide to return HttpStatus.NOT_FOUND
	        }
	        return new ResponseEntity<List<Blog_Comment>>(cmtlst, HttpStatus.OK);
	    }
	 
	 @RequestMapping(value = "/cmnt/insert/", method = RequestMethod.POST )
	    public ResponseEntity<Void> createUser(@ModelAttribute("comment") Blog_Comment blog_comment, @RequestBody Blog_Comment comment,   UriComponentsBuilder ucBuilder) {
	           System.out.println("Done Here commect Storing ");
	           System.out.println("Done Here comment Storing "+comment.getCmt());

	           

	        blog_commentDao.SaveOrUpdate(comment);
	 
	        HttpHeaders headers = new HttpHeaders();
	        headers.setLocation(ucBuilder.path("/users/{id}").buildAndExpand(comment.getCmt()).toUri());
	        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	    }

	 
	 
	 
	
}
