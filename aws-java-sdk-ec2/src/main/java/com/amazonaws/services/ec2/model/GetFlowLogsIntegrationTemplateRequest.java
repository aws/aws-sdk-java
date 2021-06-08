/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.GetFlowLogsIntegrationTemplateRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFlowLogsIntegrationTemplateRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<GetFlowLogsIntegrationTemplateRequest> {

    /**
     * <p>
     * The ID of the flow log.
     * </p>
     */
    private String flowLogId;
    /**
     * <p>
     * To store the CloudFormation template in Amazon S3, specify the location in Amazon S3.
     * </p>
     */
    private String configDeliveryS3DestinationArn;
    /**
     * <p>
     * Information about the service integration.
     * </p>
     */
    private IntegrateServices integrateServices;

    /**
     * <p>
     * The ID of the flow log.
     * </p>
     * 
     * @param flowLogId
     *        The ID of the flow log.
     */

    public void setFlowLogId(String flowLogId) {
        this.flowLogId = flowLogId;
    }

    /**
     * <p>
     * The ID of the flow log.
     * </p>
     * 
     * @return The ID of the flow log.
     */

    public String getFlowLogId() {
        return this.flowLogId;
    }

    /**
     * <p>
     * The ID of the flow log.
     * </p>
     * 
     * @param flowLogId
     *        The ID of the flow log.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFlowLogsIntegrationTemplateRequest withFlowLogId(String flowLogId) {
        setFlowLogId(flowLogId);
        return this;
    }

    /**
     * <p>
     * To store the CloudFormation template in Amazon S3, specify the location in Amazon S3.
     * </p>
     * 
     * @param configDeliveryS3DestinationArn
     *        To store the CloudFormation template in Amazon S3, specify the location in Amazon S3.
     */

    public void setConfigDeliveryS3DestinationArn(String configDeliveryS3DestinationArn) {
        this.configDeliveryS3DestinationArn = configDeliveryS3DestinationArn;
    }

    /**
     * <p>
     * To store the CloudFormation template in Amazon S3, specify the location in Amazon S3.
     * </p>
     * 
     * @return To store the CloudFormation template in Amazon S3, specify the location in Amazon S3.
     */

    public String getConfigDeliveryS3DestinationArn() {
        return this.configDeliveryS3DestinationArn;
    }

    /**
     * <p>
     * To store the CloudFormation template in Amazon S3, specify the location in Amazon S3.
     * </p>
     * 
     * @param configDeliveryS3DestinationArn
     *        To store the CloudFormation template in Amazon S3, specify the location in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFlowLogsIntegrationTemplateRequest withConfigDeliveryS3DestinationArn(String configDeliveryS3DestinationArn) {
        setConfigDeliveryS3DestinationArn(configDeliveryS3DestinationArn);
        return this;
    }

    /**
     * <p>
     * Information about the service integration.
     * </p>
     * 
     * @param integrateServices
     *        Information about the service integration.
     */

    public void setIntegrateServices(IntegrateServices integrateServices) {
        this.integrateServices = integrateServices;
    }

    /**
     * <p>
     * Information about the service integration.
     * </p>
     * 
     * @return Information about the service integration.
     */

    public IntegrateServices getIntegrateServices() {
        return this.integrateServices;
    }

    /**
     * <p>
     * Information about the service integration.
     * </p>
     * 
     * @param integrateServices
     *        Information about the service integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFlowLogsIntegrationTemplateRequest withIntegrateServices(IntegrateServices integrateServices) {
        setIntegrateServices(integrateServices);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<GetFlowLogsIntegrationTemplateRequest> getDryRunRequest() {
        Request<GetFlowLogsIntegrationTemplateRequest> request = new GetFlowLogsIntegrationTemplateRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFlowLogId() != null)
            sb.append("FlowLogId: ").append(getFlowLogId()).append(",");
        if (getConfigDeliveryS3DestinationArn() != null)
            sb.append("ConfigDeliveryS3DestinationArn: ").append(getConfigDeliveryS3DestinationArn()).append(",");
        if (getIntegrateServices() != null)
            sb.append("IntegrateServices: ").append(getIntegrateServices());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFlowLogsIntegrationTemplateRequest == false)
            return false;
        GetFlowLogsIntegrationTemplateRequest other = (GetFlowLogsIntegrationTemplateRequest) obj;
        if (other.getFlowLogId() == null ^ this.getFlowLogId() == null)
            return false;
        if (other.getFlowLogId() != null && other.getFlowLogId().equals(this.getFlowLogId()) == false)
            return false;
        if (other.getConfigDeliveryS3DestinationArn() == null ^ this.getConfigDeliveryS3DestinationArn() == null)
            return false;
        if (other.getConfigDeliveryS3DestinationArn() != null
                && other.getConfigDeliveryS3DestinationArn().equals(this.getConfigDeliveryS3DestinationArn()) == false)
            return false;
        if (other.getIntegrateServices() == null ^ this.getIntegrateServices() == null)
            return false;
        if (other.getIntegrateServices() != null && other.getIntegrateServices().equals(this.getIntegrateServices()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowLogId() == null) ? 0 : getFlowLogId().hashCode());
        hashCode = prime * hashCode + ((getConfigDeliveryS3DestinationArn() == null) ? 0 : getConfigDeliveryS3DestinationArn().hashCode());
        hashCode = prime * hashCode + ((getIntegrateServices() == null) ? 0 : getIntegrateServices().hashCode());
        return hashCode;
    }

    @Override
    public GetFlowLogsIntegrationTemplateRequest clone() {
        return (GetFlowLogsIntegrationTemplateRequest) super.clone();
    }
}
