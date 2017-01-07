angular
		.module('accountSetupApp.accountsetupcontrollers', [])
		.controller(
				'billAccController',
				function($scope, $http, $window, $rootScope,
						billingAccountInfoService, acctSetupConstants) {
					
					$scope.policyDetails = {
						policyNumber : '',
						telephone : '',
						lossDate : ''
					};
					$scope.claimSubmission = {
							make : '',
							model : '',
							firstName : '',
						    lastName : '',
						    email:''						

					}

					$scope.goToClaimsSubmission = function() {

						billingAccountInfoService.policyDetails = $scope.policyDetails;
						alert(JSON.stringify(billingAccountInfoService.policyDetails));
						$window.location = "#/claimSubmission";

					}

					$scope.submit = function() {

						alert(JSON.stringify(billingAccountInfoService.policyDetails));
						alert(JSON.stringify($scope.claimSubmission));

						$scope.claimSubmissionReq = {};
						$scope.claimSubmissionReq.policyDetails = billingAccountInfoService.policyDetails;
						$scope.claimSubmissionReq.claimSubmission = $scope.claimSubmission;
						
						alert(JSON.stringify($scope.claimSubmissionReq));

						billingAccountInfoService.submitClaims(
								$scope.claimSubmissionReq).then(
								function(response) {
									alert(response.data);

								}, function(error) {
									alert("error is " + error);
								});

					}

				})

			.controller('signupcontroller',function($scope, $http, $window, $rootScope,
					registrationService){
				

				$scope.signupDetails = {
					firstName : '',
				    lastName : '',
				    telephone:'',
				    email : ''
				};
				
				$scope.submitSignup = function() {

					alert(JSON.stringify($scope.signupDetails));

					$scope.signupSubmissionreq = {};
					$scope.signupSubmissionreq.signupDetails = $scope.signupDetails;
					
					alert(JSON.stringify($scope.signupSubmissionreq));

					registrationService.register(
							$scope.signupSubmissionreq.signupDetails).then(
							function(response) {
								alert(response.data);

							}, function(error) {
								alert("error is " + error);
							});

				}
		
			});