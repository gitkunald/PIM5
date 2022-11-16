package com.mit.poc;

import com.ibm.pim.catalog.Catalog;
import com.ibm.pim.catalog.CatalogManager;
import com.ibm.pim.context.Context;
import com.ibm.pim.context.PIMContextFactory;
import com.ibm.pim.extensionpoints.ScriptingSandboxFunction;
import com.ibm.pim.extensionpoints.ScriptingSandboxFunctionArguments;
import com.ibm.pim.utils.Logger;

public class PIMSandBoxDemo implements ScriptingSandboxFunction {

	Context ctx = PIMContextFactory.getCurrentContext();
	@Override
	public void scriptingSandbox(ScriptingSandboxFunctionArguments arg0) {
		// TODO Auto-generated method stub
		CatalogManager ctgMgr = ctx.getCatalogManager();
		Catalog ctg = ctgMgr.getCatalog("Automation_poc_Catalog");
		Logger logger = ctx.getLogger("ipm.log");
		logger.logInfo("Automation Testing ******** Jenkins Build****** ");	

	}

}
