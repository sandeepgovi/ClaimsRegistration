angular.module('accountSetupApp.accountsetupservices', []).service(
		'billingAccountInfoService', function($http,$q, acctSetupConstants) {
			// This function is for loading the page which contains the data of
			// billing account information.

			this.policyDetails = "";

			this.submitClaims = function(claimSubReq)
			
			{
				alert(JSON.stringify(claimSubReq));
				var data = $http({
					method : 'POST',
					url : '/hackathon/submitClaim.htm',
					headers: { 	
				        'Content-Type':'application/json' 
				    },
					data : claimSubReq
				});			
				return data;

			}
			
			
		})
		.service('registrationService',function($http,$q, acctSetupConstants){
			
			this.register= function(signupSubmissionreq)
			{
				
				alert(JSON.stringify(signupSubmissionreq));
				var data = $http({
					method : 'POST',
					url : '/hackathon/register.htm',
					headers: { 	
				        'Content-Type':'application/json' 
				    },
					data : signupSubmissionreq
				});			
				return data;
				
				
			}
			
			
		}

		);

			

