angular.module('studs',[]).controller('sevenController', function ($scope, $http) {

    const contextPath ='http://localhost:8189/only-task/students';


    $scope.loadStudents = function(){
        $http.get(contextPath).then(function (response){
            $scope.students = response.data;
        });
    }
    $scope.loadStudents();


    $scope.removeStudent = function (id){
        $http({
            url:contextPath+'/delete/'+id,
            method: 'POST'
        })
            .then(function (response){
                $scope.loadStudents();
            });
    };

});
