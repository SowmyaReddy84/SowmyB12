package com.niit.coolcodersbackend.restcontroller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.niit.coolcodersbackend.dao.JobDao;
import com.niit.coolcodersbackend.dao.Job_CommentDao;
import com.niit.coolcodersbackend.model.Job;
import com.niit.coolcodersbackend.model.Job_Comment;



@RestController
public class JobController {

	@Autowired
	Job job;
	@Autowired
	JobDao jobDao;
	@Autowired
	Job_Comment job_comment;
	@Autowired
	Job_CommentDao job_commentDao;
	
	@RequestMapping(value = "/job", method = RequestMethod.GET)
    public ResponseEntity<List<Job>> listAllJob() {
        List<Job> joblst = jobDao.getAllJobList();
        
        if(joblst.isEmpty()){
            return new ResponseEntity<List<Job>>(HttpStatus.NO_CONTENT);
            //You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Job>>(joblst, HttpStatus.OK);
    }
	
	//COMMENTS
	 
		 @RequestMapping(value = "/jcoments/{jid}", method = RequestMethod.GET)
		    public ResponseEntity<List<Job_Comment>> listComents(@RequestParam("jid") int jid) {
		   
			 System.out.println("333333333333333333333333333333");
			 System.out.println(jid);   
			 List<Job_Comment> cmtlst = job_commentDao.getAllCmnts();
		        System.out.println("444444444444444444444444444444");
		        if(cmtlst.isEmpty()){
		            return new ResponseEntity<List<Job_Comment>>(HttpStatus.NO_CONTENT);
		            //You many decide to return HttpStatus.NOT_FOUND
		        }
		        return new ResponseEntity<List<Job_Comment>>(cmtlst, HttpStatus.OK);
		    }
	
	
}
