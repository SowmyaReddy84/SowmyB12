'use strict';

angular.module('myApp').factory('BlogService', ['$http', '$q', function($http, $q){

  
    var factory = {
        fetchAllBlogs: fetchAllBlogs,
        addBlog:addBlog,
        addCom :addCom,
        fetchAllCom:fetchAllCom,
        blogDel:blogDel
     };
  
    return factory;

    function fetchAllBlogs() {
        var deferred = $q.defer();
        $http.get('http://localhost:8081/CoolCodersBackend/blogs')
            .then(
            function (response) {
            	console.log('Got data');
            	deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while fetching Data');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }
    function addBlog(blogm) {
        var deferred = $q.defer();
        console.log("2222222222222222222222222222222222222");
        $http.post('http://localhost:8081/CoolCodersBackend/blog/insert/',blogm)
            .then(
            		
            function (response) {
            	 console.log(blogm);
            	 console.log("555555555555555555555555");
            	console.log('Saving New User A2',blogm);
            	deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while creating blog');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }

    function addCom(comment) {
        var deferred = $q.defer();
        $http.post('http://localhost:8081/CoolCodersBackend/cmnt/insert/',comment)
      
            .then(
            		
            function (response) {
            	deferred.resolve(response.data);
            	console.log('done');
            },
            function(errResponse){
                console.error('Error while creating cmnt');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }
   
    function fetchAllCom(bid) {
        var deferred = $q.defer();
        $http.get('http://localhost:8081/CoolCodersBackend/coments/'+bid)
            .then(
            function (response) {
            	console.log('Got data');
            	deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while fetching Data');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }
    
    function blogDel(bid) {
        var deferred = $q.defer();
        console.log(bid,"Del process C")
        $http['delete']('http://localhost:8081/CoolCodersBackend/blogDel/'+bid)
            .then(
            function (response) {
            	console.log("Del process D")
            	deferred.resolve(response.data);
            },
            function(errResponse){
            	console.log("Del process E")
                console.error('Error while fetching Data');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }

}]);
