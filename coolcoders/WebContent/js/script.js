/**
 * 
 */
var app = angular.module("MyApp", []);

//Create a service Products

app.service('Products', function () {
  
  this.Items = function() {
     product = { product: '', price: '' }
     console.log=this+'hello';
  };
    console.log=this+'hello';
    return this.Items;
});

app.controller("Ctrl1", ['$scope', 'Products',
    function ($scope, Products) {
    $scope.Product = Products.Items;
  
    $scope.security=function(x){
	  console.log("done",x)
	  $scope.Product=x;
	  Products.Items=$scope.Product;
	  window.location="security2.html/+'{{Products.Items}}'";
  }
}]);
 
app.controller("Ctrl2", ['$scope', 'Products',
    function ($scope, Products) {
    $scope.Product = Products.Items;
    console.log=$scope.Product;
 
}]);
