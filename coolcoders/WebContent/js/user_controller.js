'use strict';



angular.module('myApp').controller('UserController', ['$scope','$rootScope','$location','UserService', function($scope,$rootScope,$location,UserService) {
   
	$scope.users={id:'',loginid:'',name:'',password:''};
    $scope.userlist=[];
    $rootScope.uname=$scope.users.name;
//	var nurl='home.html'

    
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
        			
//        			 window.location = "home.html";            
        			},
        		function(errResponse){
            console.error('Error while creating Users');
        });
    }
    $scope.doLogins=function(users)
    {	
    	
    	console.log('STEP 1');
    	 console.log(users.name);
    	UserService.doLogins(users)
        .then(
        		function (d) {
        			if(d!=null)
        				console.log('doneD');
        			else
        				console.log('Not doneD');22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222
        			$scope.users=d;
                	alert("You are authorised");
        			console.log('doneD',$scope.users.name);/////////the  last line done d ss is printing here
        			$location.path('/home');
//        			window.location="home.html";
//        			window.location.href=nurl;
        			$rootScope.uname=$scope.users.name;
//        			console.log("TESTING...",$rootscope.n);
//        			console.log("TESTING...",n.unm);

                },
        		function(errResponse){
                	alert("You are not authorised");
                	console.error('Error while creating Users');
        });
    }

      
   

}]);
