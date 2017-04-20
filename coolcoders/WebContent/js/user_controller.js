'use strict';



angular.module('myApp').controller('UserController', ['$scope','$rootScope', 'UserService', function($scope,$rootScope, UserService) {
   
	$scope.users={id:'',loginid:'',name:'',password:''};
    $scope.userlist=[];
	$rootScope.uid=name;

    $scope.getAll=function(){
    	UserService.fetchAllUsers()
        .then(
        function(d) {
        	$scope.users = d;
        	 console.log($scope.users);

        	 console.log('Done');
        	 
        },
        function(errResponse){
            console.error('Error while fetching Users');
        });
    }
    $scope.regiUser=function(users)
    {
    	console.log('DoneA');
   	 console.log(users);

    	UserService.regiUser(users)
        .then(
        		function (response) {
        			alert(users.name+" "+"you have successfully registered");
        			console.log('doneD',users.name);
        			
        			 window.location = "home.html";                },
        		function(errResponse){
            console.error('Error while creating Users');
        });
    }
    $scope.doLogin=function(users)
    {	
    	
    	console.log('STEP 1');
    	 console.log(users.name);
    	UserService.doLogin(users)
        .then(
        		function (response) {
                	alert("You are authorised");
        			console.log('doneD',users.name);
        			$rootScope.uid=users.name;
        			console.log("TESTING...",name);
        			
        			 window.location = "home.html";
                },
        		function(errResponse){
                	alert("You are not authorised");
                	console.error('Error while creating Users');
        });
    }

      
   

}]);
