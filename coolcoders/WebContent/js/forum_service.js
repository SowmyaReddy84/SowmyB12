'use strict';

angular.module('myApp').factory('ForumService', ['$http', '$q', function($http, $q){

  
    var factory = {
    		fetchAllForums: fetchAllForums,
    		addForum:addForum,
    		addRpl :addRpl,
    		fetchAllRep: fetchAllRep
     };
  
    return factory;

    function fetchAllForums() {
        var deferred = $q.defer();
        $http.get('http://localhost:8081/CoolCodersBackend/forums')
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
    function addForum(forumm) {
        var deferred = $q.defer();

        $http.post('http://localhost:8081/CoolCodersBackend/frmadd/insert/',forumm)
            .then(
            		
            function (response) {
            	deferred.resolve(response.data);
            	 console.log(done);
            },
            function(errResponse){
                console.error('Error while creating Forumm');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }
    function addRpl(reply) {
        var deferred = $q.defer();
        $http.post('http://localhost:8081/CoolCodersBackend/reply/insert/',reply)
      
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
   
    function  fetchAllRep(fid) {
        var deferred = $q.defer();
        $http.get('http://localhost:8081/CoolCodersBackend/replies/'+fid)
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

}]);
