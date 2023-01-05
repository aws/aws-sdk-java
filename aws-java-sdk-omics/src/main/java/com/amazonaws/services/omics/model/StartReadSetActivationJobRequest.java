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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartReadSetActivationJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartReadSetActivationJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * To ensure that jobs don't run multiple times, specify a unique token for each job.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The read set's sequence store ID.
     * </p>
     */
    private String sequenceStoreId;
    /**
     * <p>
     * The job's sources.
     * </p>
     */
    private java.util.List<StartReadSetActivationJobSourceItem> sources;

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

    public StartReadSetActivationJobRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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

    public StartReadSetActivationJobRequest withSequenceStoreId(String sequenceStoreId) {
        setSequenceStoreId(sequenceStoreId);
        return this;
    }

    /**
     * <p>
     * The job's sources.
     * </p>
     * 
     * @return The job's sources.
     */

    public java.util.List<StartReadSetActivationJobSourceItem> getSources() {
        return sources;
    }

    /**
     * <p>
     * The job's sources.
     * </p>
     * 
     * @param sources
     *        The job's sources.
     */

    public void setSources(java.util.Collection<StartReadSetActivationJobSourceItem> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<StartReadSetActivationJobSourceItem>(sources);
    }

    /**
     * <p>
     * The job's sources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        The job's sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReadSetActivationJobRequest withSources(StartReadSetActivationJobSourceItem... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<StartReadSetActivationJobSourceItem>(sources.length));
        }
        for (StartReadSetActivationJobSourceItem ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The job's sources.
     * </p>
     * 
     * @param sources
     *        The job's sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReadSetActivationJobRequest withSources(java.util.Collection<StartReadSetActivationJobSourceItem> sources) {
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

        if (obj instanceof StartReadSetActivationJobRequest == false)
            return false;
        StartReadSetActivationJobRequest other = (StartReadSetActivationJobRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
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
        hashCode = prime * hashCode + ((getSequenceStoreId() == null) ? 0 : getSequenceStoreId().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        return hashCode;
    }

    @Override
    public StartReadSetActivationJobRequest clone() {
        return (StartReadSetActivationJobRequest) super.clone();
    }

}
