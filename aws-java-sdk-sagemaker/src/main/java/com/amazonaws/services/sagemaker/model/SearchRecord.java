/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An individual search result record that contains a single resource object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/SearchRecord" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchRecord implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A <code>TrainingJob</code> object that is returned as part of a <code>Search</code> request.
     * </p>
     */
    private TrainingJob trainingJob;

    /**
     * <p>
     * A <code>TrainingJob</code> object that is returned as part of a <code>Search</code> request.
     * </p>
     * 
     * @param trainingJob
     *        A <code>TrainingJob</code> object that is returned as part of a <code>Search</code> request.
     */

    public void setTrainingJob(TrainingJob trainingJob) {
        this.trainingJob = trainingJob;
    }

    /**
     * <p>
     * A <code>TrainingJob</code> object that is returned as part of a <code>Search</code> request.
     * </p>
     * 
     * @return A <code>TrainingJob</code> object that is returned as part of a <code>Search</code> request.
     */

    public TrainingJob getTrainingJob() {
        return this.trainingJob;
    }

    /**
     * <p>
     * A <code>TrainingJob</code> object that is returned as part of a <code>Search</code> request.
     * </p>
     * 
     * @param trainingJob
     *        A <code>TrainingJob</code> object that is returned as part of a <code>Search</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRecord withTrainingJob(TrainingJob trainingJob) {
        setTrainingJob(trainingJob);
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
        if (getTrainingJob() != null)
            sb.append("TrainingJob: ").append(getTrainingJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchRecord == false)
            return false;
        SearchRecord other = (SearchRecord) obj;
        if (other.getTrainingJob() == null ^ this.getTrainingJob() == null)
            return false;
        if (other.getTrainingJob() != null && other.getTrainingJob().equals(this.getTrainingJob()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrainingJob() == null) ? 0 : getTrainingJob().hashCode());
        return hashCode;
    }

    @Override
    public SearchRecord clone() {
        try {
            return (SearchRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.SearchRecordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
