'use strict';



angular.module('myApp').controller('UserController', ['$scope','$rootScope', 'UserService', function($scope,$rootScope, UserService) {
   
	$scope.users={id:'',loginid:'',name:'',password:''};
    $scope.userlist=[];
    $rootScope.n={unm:''};
    
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
        				console.log('Not doneD');
        			$scope.users=d;
                	alert("You are authorised");
        			console.log('doneD',$scope.users.name);
        			
        			window.location = "home.html";
        			$rootScope.n.unm=$scope.users.name;
//        			console.log("TESTING...",$rootscope.n);
//        			console.log("TESTING...",n.unm);

                },
        		function(errResponse){
                	alert("You are not authorised");
                	console.error('Error while creating Users');
        });
    }

      
   

}]);
