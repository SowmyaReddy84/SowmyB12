'use strict';
angular.module('myApp').factory('myService',['$http', '$q',function($http, $q){
	
		 var uid = {}
		 function set(data) {
		   uid = data;
		 }
		 function get() {
		  return uid;
		 }

		 return {
		  set: set,
		  get: get
		 }

	
	

}]);