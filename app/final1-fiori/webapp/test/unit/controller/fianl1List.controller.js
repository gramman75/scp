/*global QUnit*/

sap.ui.define([
	"ns/final1-fiori/controller/fianl1List.controller"
], function (Controller) {
	"use strict";

	QUnit.module("fianl1List Controller");

	QUnit.test("I should test the fianl1List controller", function (assert) {
		var oAppController = new Controller();
		oAppController.onInit();
		assert.ok(oAppController);
	});

});
