/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/BatchGetIncidentFindings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetIncidentFindingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of IDs of findings for which you want to view details.
     * </p>
     */
    private java.util.List<String> findingIds;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident for which you want to view finding details.
     * </p>
     */
    private String incidentRecordArn;

    /**
     * <p>
     * A list of IDs of findings for which you want to view details.
     * </p>
     * 
     * @return A list of IDs of findings for which you want to view details.
     */

    public java.util.List<String> getFindingIds() {
        return findingIds;
    }

    /**
     * <p>
     * A list of IDs of findings for which you want to view details.
     * </p>
     * 
     * @param findingIds
     *        A list of IDs of findings for which you want to view details.
     */

    public void setFindingIds(java.util.Collection<String> findingIds) {
        if (findingIds == null) {
            this.findingIds = null;
            return;
        }

        this.findingIds = new java.util.ArrayList<String>(findingIds);
    }

    /**
     * <p>
     * A list of IDs of findings for which you want to view details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFindingIds(java.util.Collection)} or {@link #withFindingIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param findingIds
     *        A list of IDs of findings for which you want to view details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetIncidentFindingsRequest withFindingIds(String... findingIds) {
        if (this.findingIds == null) {
            setFindingIds(new java.util.ArrayList<String>(findingIds.length));
        }
        for (String ele : findingIds) {
            this.findingIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of IDs of findings for which you want to view details.
     * </p>
     * 
     * @param findingIds
     *        A list of IDs of findings for which you want to view details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetIncidentFindingsRequest withFindingIds(java.util.Collection<String> findingIds) {
        setFindingIds(findingIds);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident for which you want to view finding details.
     * </p>
     * 
     * @param incidentRecordArn
     *        The Amazon Resource Name (ARN) of the incident for which you want to view finding details.
     */

    public void setIncidentRecordArn(String incidentRecordArn) {
        this.incidentRecordArn = incidentRecordArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident for which you want to view finding details.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the incident for which you want to view finding details.
     */

    public String getIncidentRecordArn() {
        return this.incidentRecordArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident for which you want to view finding details.
     * </p>
     * 
     * @param incidentRecordArn
     *        The Amazon Resource Name (ARN) of the incident for which you want to view finding details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetIncidentFindingsRequest withIncidentRecordArn(String incidentRecordArn) {
        setIncidentRecordArn(incidentRecordArn);
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
        if (getFindingIds() != null)
            sb.append("FindingIds: ").append(getFindingIds()).append(",");
        if (getIncidentRecordArn() != null)
            sb.append("IncidentRecordArn: ").append(getIncidentRecordArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetIncidentFindingsRequest == false)
            return false;
        BatchGetIncidentFindingsRequest other = (BatchGetIncidentFindingsRequest) obj;
        if (other.getFindingIds() == null ^ this.getFindingIds() == null)
            return false;
        if (other.getFindingIds() != null && other.getFindingIds().equals(this.getFindingIds()) == false)
            return false;
        if (other.getIncidentRecordArn() == null ^ this.getIncidentRecordArn() == null)
            return false;
        if (other.getIncidentRecordArn() != null && other.getIncidentRecordArn().equals(this.getIncidentRecordArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFindingIds() == null) ? 0 : getFindingIds().hashCode());
        hashCode = prime * hashCode + ((getIncidentRecordArn() == null) ? 0 : getIncidentRecordArn().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetIncidentFindingsRequest clone() {
        return (BatchGetIncidentFindingsRequest) super.clone();
    }

}
