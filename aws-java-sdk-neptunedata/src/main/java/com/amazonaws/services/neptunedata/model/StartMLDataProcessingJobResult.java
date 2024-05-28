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
package com.amazonaws.services.neptunedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/StartMLDataProcessingJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartMLDataProcessingJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the new data processing job.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ARN of the data processing job.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time it took to create the new processing job, in milliseconds.
     * </p>
     */
    private Long creationTimeInMillis;

    /**
     * <p>
     * The unique ID of the new data processing job.
     * </p>
     * 
     * @param id
     *        The unique ID of the new data processing job.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID of the new data processing job.
     * </p>
     * 
     * @return The unique ID of the new data processing job.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique ID of the new data processing job.
     * </p>
     * 
     * @param id
     *        The unique ID of the new data processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMLDataProcessingJobResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ARN of the data processing job.
     * </p>
     * 
     * @param arn
     *        The ARN of the data processing job.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the data processing job.
     * </p>
     * 
     * @return The ARN of the data processing job.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the data processing job.
     * </p>
     * 
     * @param arn
     *        The ARN of the data processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMLDataProcessingJobResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time it took to create the new processing job, in milliseconds.
     * </p>
     * 
     * @param creationTimeInMillis
     *        The time it took to create the new processing job, in milliseconds.
     */

    public void setCreationTimeInMillis(Long creationTimeInMillis) {
        this.creationTimeInMillis = creationTimeInMillis;
    }

    /**
     * <p>
     * The time it took to create the new processing job, in milliseconds.
     * </p>
     * 
     * @return The time it took to create the new processing job, in milliseconds.
     */

    public Long getCreationTimeInMillis() {
        return this.creationTimeInMillis;
    }

    /**
     * <p>
     * The time it took to create the new processing job, in milliseconds.
     * </p>
     * 
     * @param creationTimeInMillis
     *        The time it took to create the new processing job, in milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMLDataProcessingJobResult withCreationTimeInMillis(Long creationTimeInMillis) {
        setCreationTimeInMillis(creationTimeInMillis);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationTimeInMillis() != null)
            sb.append("CreationTimeInMillis: ").append(getCreationTimeInMillis());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartMLDataProcessingJobResult == false)
            return false;
        StartMLDataProcessingJobResult other = (StartMLDataProcessingJobResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationTimeInMillis() == null ^ this.getCreationTimeInMillis() == null)
            return false;
        if (other.getCreationTimeInMillis() != null && other.getCreationTimeInMillis().equals(this.getCreationTimeInMillis()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeInMillis() == null) ? 0 : getCreationTimeInMillis().hashCode());
        return hashCode;
    }

    @Override
    public StartMLDataProcessingJobResult clone() {
        try {
            return (StartMLDataProcessingJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
