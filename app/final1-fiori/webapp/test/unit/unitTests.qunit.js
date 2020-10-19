/* global QUnit */
QUnit.config.autostart = false;

sap.ui.getCore().attachInit(function () {
	"use strict";

	sap.ui.require([
		"ns/final1-fiori/test/unit/AllTests"
	], function () {
		QUnit.start();
	});
});
