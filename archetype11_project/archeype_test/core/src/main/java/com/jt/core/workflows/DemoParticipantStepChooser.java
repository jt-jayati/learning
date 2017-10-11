package com.jt.core.workflows;

import com.day.cq.workflow.WorkflowException;
import com.day.cq.workflow.WorkflowSession;
import com.day.cq.workflow.exec.ParticipantStepChooser;
import com.day.cq.workflow.exec.WorkItem;
import com.day.cq.workflow.metadata.MetaDataMap;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by jayati on 10/5/2017.
 */
@Component(service = ParticipantStepChooser.class,immediate = true,
        property = {ParticipantStepChooser.SERVICE_PROPERTY_LABEL+"=Jt Participant Choser",
                    Constants.SERVICE_DESCRIPTION+"=Jt Participant Desc",
                    "service.pid=com.jt.core.workflows.DemoParticipantStepChooser"})
public class DemoParticipantStepChooser implements ParticipantStepChooser {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public String getParticipant(WorkItem workItem, WorkflowSession workflowSession, MetaDataMap metaDataMap) throws WorkflowException {
        logger.info("PARTICIPANT CHOOSER STEP");
        return "admin";
    }
}
