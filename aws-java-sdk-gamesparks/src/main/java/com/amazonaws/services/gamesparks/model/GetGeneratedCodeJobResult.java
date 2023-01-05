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
package com.amazonaws.services.gamesparks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetGeneratedCodeJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGeneratedCodeJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Details about the generated code job.
     * </p>
     */
    private GeneratedCodeJobDetails generatedCodeJob;

    /**
     * <p>
     * Details about the generated code job.
     * </p>
     * 
     * @param generatedCodeJob
     *        Details about the generated code job.
     */

    public void setGeneratedCodeJob(GeneratedCodeJobDetails generatedCodeJob) {
        this.generatedCodeJob = generatedCodeJob;
    }

    /**
     * <p>
     * Details about the generated code job.
     * </p>
     * 
     * @return Details about the generated code job.
     */

    public GeneratedCodeJobDetails getGeneratedCodeJob() {
        return this.generatedCodeJob;
    }

    /**
     * <p>
     * Details about the generated code job.
     * </p>
     * 
     * @param generatedCodeJob
     *        Details about the generated code job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGeneratedCodeJobResult withGeneratedCodeJob(GeneratedCodeJobDetails generatedCodeJob) {
        setGeneratedCodeJob(generatedCodeJob);
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
        if (getGeneratedCodeJob() != null)
            sb.append("GeneratedCodeJob: ").append(getGeneratedCodeJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGeneratedCodeJobResult == false)
            return false;
        GetGeneratedCodeJobResult other = (GetGeneratedCodeJobResult) obj;
        if (other.getGeneratedCodeJob() == null ^ this.getGeneratedCodeJob() == null)
            return false;
        if (other.getGeneratedCodeJob() != null && other.getGeneratedCodeJob().equals(this.getGeneratedCodeJob()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGeneratedCodeJob() == null) ? 0 : getGeneratedCodeJob().hashCode());
        return hashCode;
    }

    @Override
    public GetGeneratedCodeJobResult clone() {
        try {
            return (GetGeneratedCodeJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
