'use strict';

var App = angular.module('myApp',['ngRoute']);
App.config(function($routeProvider) {
    $routeProvider
    .when("\home", {
    	
        templateUrl : "\home.html"
        	
    })
    
  
});



