app.config(['$locationProvider', function($locationProvider) {
  $locationProvider.hashPrefix('');

}]);
app.config(['$routeProvider',function($routeProvider){
  $routeProvider.when('/home',{
    templateUrl:'views/home.html',
    controller:'homeController'
  }).when('/register',{
    templateUrl:'views/register.html',
    controller:'registerController'
  }).when('/login',{
    templateUrl:'views/login.html',
    controller:'loginController'
  }).otherwise({ redirectTo: '/login' });
}]);
