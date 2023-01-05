/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartReadSetExportJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartReadSetExportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * To ensure that jobs don't run multiple times, specify a unique token for each job.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * A location for exported files in Amazon S3.
     * </p>
     */
    private String destination;
    /**
     * <p>
     * A service role for the job.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The read set's sequence store ID.
     * </p>
     */
    private String sequenceStoreId;
    /**
     * <p>
     * Sources for the job.
     * </p>
     */
    private java.util.List<ExportReadSet> sources;

    /**
     * <p>
     * To ensure that jobs don't run multiple times, specify a unique token for each job.
     * </p>
     * 
     * @param clientToken
     *        To ensure that jobs don't run multiple times, specify a unique token for each job.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * To ensure that jobs don't run multiple times, specify a unique token for each job.
     * </p>
     * 
     * @return To ensure that jobs don't run multiple times, specify a unique token for each job.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * To ensure that jobs don't run multiple times, specify a unique token for each job.
     * </p>
     * 
     * @param clientToken
     *        To ensure that jobs don't run multiple times, specify a unique token for each job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReadSetExportJobRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A location for exported files in Amazon S3.
     * </p>
     * 
     * @param destination
     *        A location for exported files in Amazon S3.
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * A location for exported files in Amazon S3.
     * </p>
     * 
     * @return A location for exported files in Amazon S3.
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * A location for exported files in Amazon S3.
     * </p>
     * 
     * @param destination
     *        A location for exported files in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReadSetExportJobRequest withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * A service role for the job.
     * </p>
     * 
     * @param roleArn
     *        A service role for the job.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * A service role for the job.
     * </p>
     * 
     * @return A service role for the job.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * A service role for the job.
     * </p>
     * 
     * @param roleArn
     *        A service role for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReadSetExportJobRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The read set's sequence store ID.
     * </p>
     * 
     * @param sequenceStoreId
     *        The read set's sequence store ID.
     */

    public void setSequenceStoreId(String sequenceStoreId) {
        this.sequenceStoreId = sequenceStoreId;
    }

    /**
     * <p>
     * The read set's sequence store ID.
     * </p>
     * 
     * @return The read set's sequence store ID.
     */

    public String getSequenceStoreId() {
        return this.sequenceStoreId;
    }

    /**
     * <p>
     * The read set's sequence store ID.
     * </p>
     * 
     * @param sequenceStoreId
     *        The read set's sequence store ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReadSetExportJobRequest withSequenceStoreId(String sequenceStoreId) {
        setSequenceStoreId(sequenceStoreId);
        return this;
    }

    /**
     * <p>
     * Sources for the job.
     * </p>
     * 
     * @return Sources for the job.
     */

    public java.util.List<ExportReadSet> getSources() {
        return sources;
    }

    /**
     * <p>
     * Sources for the job.
     * </p>
     * 
     * @param sources
     *        Sources for the job.
     */

    public void setSources(java.util.Collection<ExportReadSet> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<ExportReadSet>(sources);
    }

    /**
     * <p>
     * Sources for the job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        Sources for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReadSetExportJobRequest withSources(ExportReadSet... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<ExportReadSet>(sources.length));
        }
        for (ExportReadSet ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Sources for the job.
     * </p>
     * 
     * @param sources
     *        Sources for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReadSetExportJobRequest withSources(java.util.Collection<ExportReadSet> sources) {
        setSources(sources);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSequenceStoreId() != null)
            sb.append("SequenceStoreId: ").append(getSequenceStoreId()).append(",");
        if (getSources() != null)
            sb.append("Sources: ").append(getSources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartReadSetExportJobRequest == false)
            return false;
        StartReadSetExportJobRequest other = (StartReadSetExportJobRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSequenceStoreId() == null ^ this.getSequenceStoreId() == null)
            return false;
        if (other.getSequenceStoreId() != null && other.getSequenceStoreId().equals(this.getSequenceStoreId()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSequenceStoreId() == null) ? 0 : getSequenceStoreId().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        return hashCode;
    }

    @Override
    public StartReadSetExportJobRequest clone() {
        return (StartReadSetExportJobRequest) super.clone();
    }

}
