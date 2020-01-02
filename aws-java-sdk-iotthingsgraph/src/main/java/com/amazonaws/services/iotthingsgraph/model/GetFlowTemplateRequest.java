/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotthingsgraph.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetFlowTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFlowTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the workflow.
     * </p>
     * <p>
     * The ID should be in the following format.
     * </p>
     * <p>
     * <code>urn:tdm:REGION/ACCOUNT ID/default:workflow:WORKFLOWNAME</code>
     * </p>
     */
    private String id;
    /**
     * <p>
     * The number of the workflow revision to retrieve.
     * </p>
     */
    private Long revisionNumber;

    /**
     * <p>
     * The ID of the workflow.
     * </p>
     * <p>
     * The ID should be in the following format.
     * </p>
     * <p>
     * <code>urn:tdm:REGION/ACCOUNT ID/default:workflow:WORKFLOWNAME</code>
     * </p>
     * 
     * @param id
     *        The ID of the workflow.</p>
     *        <p>
     *        The ID should be in the following format.
     *        </p>
     *        <p>
     *        <code>urn:tdm:REGION/ACCOUNT ID/default:workflow:WORKFLOWNAME</code>
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the workflow.
     * </p>
     * <p>
     * The ID should be in the following format.
     * </p>
     * <p>
     * <code>urn:tdm:REGION/ACCOUNT ID/default:workflow:WORKFLOWNAME</code>
     * </p>
     * 
     * @return The ID of the workflow.</p>
     *         <p>
     *         The ID should be in the following format.
     *         </p>
     *         <p>
     *         <code>urn:tdm:REGION/ACCOUNT ID/default:workflow:WORKFLOWNAME</code>
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the workflow.
     * </p>
     * <p>
     * The ID should be in the following format.
     * </p>
     * <p>
     * <code>urn:tdm:REGION/ACCOUNT ID/default:workflow:WORKFLOWNAME</code>
     * </p>
     * 
     * @param id
     *        The ID of the workflow.</p>
     *        <p>
     *        The ID should be in the following format.
     *        </p>
     *        <p>
     *        <code>urn:tdm:REGION/ACCOUNT ID/default:workflow:WORKFLOWNAME</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFlowTemplateRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The number of the workflow revision to retrieve.
     * </p>
     * 
     * @param revisionNumber
     *        The number of the workflow revision to retrieve.
     */

    public void setRevisionNumber(Long revisionNumber) {
        this.revisionNumber = revisionNumber;
    }

    /**
     * <p>
     * The number of the workflow revision to retrieve.
     * </p>
     * 
     * @return The number of the workflow revision to retrieve.
     */

    public Long getRevisionNumber() {
        return this.revisionNumber;
    }

    /**
     * <p>
     * The number of the workflow revision to retrieve.
     * </p>
     * 
     * @param revisionNumber
     *        The number of the workflow revision to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFlowTemplateRequest withRevisionNumber(Long revisionNumber) {
        setRevisionNumber(revisionNumber);
        return this;
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getRevisionNumber() != null)
            sb.append("RevisionNumber: ").append(getRevisionNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFlowTemplateRequest == false)
            return false;
        GetFlowTemplateRequest other = (GetFlowTemplateRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getRevisionNumber() == null ^ this.getRevisionNumber() == null)
            return false;
        if (other.getRevisionNumber() != null && other.getRevisionNumber().equals(this.getRevisionNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getRevisionNumber() == null) ? 0 : getRevisionNumber().hashCode());
        return hashCode;
    }

    @Override
    public GetFlowTemplateRequest clone() {
        return (GetFlowTemplateRequest) super.clone();
    }

}
