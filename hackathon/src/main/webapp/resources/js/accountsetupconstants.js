angular.module('accountSetupApp.accountsetupconstants', [])
.constant('acctSetupConstants',{
	APPVERSION : 'api/v1',
	ACCTSETUPINFORESTURL : 'account',
	OPENCHATAPP : 'openChatApp',
	CHATDATARESTURL : 'chat/chatData',
	CHATDOWNMSG : 'Chat services are not available at this time',
	AUTOPAYMENTINFORESTURL : 'billingpayment',
	ACCTSETUPQUOTE : 'quote',
	ACCTSETUPTRANSACTIONID : 'transactionId',
	ACCTSETUPTRANSACTIONDATE : 'transactionDate',
	DUEDAYRESTURL : 'install-calc/duedate',
	BACKBTNRESTURL : 'backbtn',
	METHOD_GET : 'GET',	
	METHOD_POST : 'POST',		
	BACKBTNACCTINFO : 'backBtnAccBillingInfo',
	NEXTBTNACCTINFO : 'nextBtnAutoPaymentInfo',
	INSTALLCALC : 'dueDayChange',
	CREATEACCTNUM : 'selectBillingAccountOption',
	ACCTINFOPAGE : '#/billingAccountInfoOpt',
	AUTOPAYMENTPAGE : '#/billingAutoPaymentInfoOpt',
	EXCEPTIONPAGE : '#/exception'
});
