'use strict';

angular.module('myApp').factory('UserService', ['$http', '$q', function($http, $q){

  
    var factory = {
        fetchAllUsers: fetchAllUsers,
        regiUser: regiUser,
        doLogin:doLogin
     };
    var nam="name";
    return factory;

    function fetchAllUsers() {
        var deferred = $q.defer();
        
        $http.get('http://localhost:8081/CoolCodersBackend/users/?name="name"')
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
    function regiUser(users) {
        var deferred = $q.defer();
        console.log('Done B');
//        $http.post('http://localhost:8080/CodersBench/user/insert/',{user: u})
        $http.post('http://localhost:8081/CoolCodersBackend/users/insert/',users)
            .then(
            		
            function (response) {
            	deferred.resolve(response.data);
            	console.log('done C');
            },
            function(errResponse){
                console.error('Error while creating Users');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }
    function doLogin(users) {
        var deferred = $q.defer();
        console.log('STEP 2');
//        http://localhost:8081/CoolCodersBackend/users/dologs/1/ss
        $http.get('http://localhost:8081/CoolCodersBackend/users/dologs/'+users.name+'/'+users.password)
      
            .then(
            		
            function (response) {
            	deferred.resolve(response.data);
            	console.log('done C');
            },
            function(errResponse){
                console.error('Error while creating Users');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }
   

}]);
