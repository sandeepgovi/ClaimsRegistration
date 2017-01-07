'use strict';

var accountSetup = angular.module('accountSetupApp', [ 'ngRoute',
		'accountSetupApp.accountsetupcontrollers',
		'accountSetupApp.accountsetupservices',
		'accountSetupApp.accountsetupconstants' ]);



accountSetup.config([ '$routeProvider', 'acctSetupConstants',
		function($routeProvider, acctSetupConstants) {

			$routeProvider.when('/policyDetails', {
				templateUrl : 'partials/policyDetails.html',
				controller : 'billAccController'
			});
			
			$routeProvider.when('/claimSubmission', {
				templateUrl : 'partials/ClaimSubmission.html',
				controller : 'billAccController'
			});
			
			$routeProvider.when('/signup', {
				templateUrl : 'partials/signup.html',
				controller : 'signupcontroller'
			});
			

		} ]);
