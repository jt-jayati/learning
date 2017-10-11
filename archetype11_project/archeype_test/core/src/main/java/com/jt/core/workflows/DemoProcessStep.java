package com.jt.core.workflows;

import com.day.cq.workflow.WorkflowException;
import com.day.cq.workflow.WorkflowSession;
import com.day.cq.workflow.exec.WorkItem;
import com.day.cq.workflow.exec.WorkflowProcess;
import com.day.cq.workflow.metadata.MetaDataMap;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by jayati on 10/5/2017.
 */
@Component(service = WorkflowProcess.class, immediate = true,
        property = {"process.label=Jt ProcessStep",
                    Constants.SERVICE_DESCRIPTION+"=Jt ProcessStep Desc",
                    "service.pid=com.jt.core.workflows.DemoProcessStep"})
public class DemoProcessStep implements WorkflowProcess {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void execute(WorkItem workItem, WorkflowSession workflowSession, MetaDataMap metaDataMap) throws WorkflowException {
        logger.info("PROCESS STEP");
    }
}
