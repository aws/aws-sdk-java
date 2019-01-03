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
package com.amazonaws.services.kinesisanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * TBD
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/CreateApplication" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApplicationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * In response to your <code>CreateApplication</code> request, Amazon Kinesis Analytics returns a response with a
     * summary of the application it created, including the application Amazon Resource Name (ARN), name, and status.
     * </p>
     */
    private ApplicationSummary applicationSummary;

    /**
     * <p>
     * In response to your <code>CreateApplication</code> request, Amazon Kinesis Analytics returns a response with a
     * summary of the application it created, including the application Amazon Resource Name (ARN), name, and status.
     * </p>
     * 
     * @param applicationSummary
     *        In response to your <code>CreateApplication</code> request, Amazon Kinesis Analytics returns a response
     *        with a summary of the application it created, including the application Amazon Resource Name (ARN), name,
     *        and status.
     */

    public void setApplicationSummary(ApplicationSummary applicationSummary) {
        this.applicationSummary = applicationSummary;
    }

    /**
     * <p>
     * In response to your <code>CreateApplication</code> request, Amazon Kinesis Analytics returns a response with a
     * summary of the application it created, including the application Amazon Resource Name (ARN), name, and status.
     * </p>
     * 
     * @return In response to your <code>CreateApplication</code> request, Amazon Kinesis Analytics returns a response
     *         with a summary of the application it created, including the application Amazon Resource Name (ARN), name,
     *         and status.
     */

    public ApplicationSummary getApplicationSummary() {
        return this.applicationSummary;
    }

    /**
     * <p>
     * In response to your <code>CreateApplication</code> request, Amazon Kinesis Analytics returns a response with a
     * summary of the application it created, including the application Amazon Resource Name (ARN), name, and status.
     * </p>
     * 
     * @param applicationSummary
     *        In response to your <code>CreateApplication</code> request, Amazon Kinesis Analytics returns a response
     *        with a summary of the application it created, including the application Amazon Resource Name (ARN), name,
     *        and status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationResult withApplicationSummary(ApplicationSummary applicationSummary) {
        setApplicationSummary(applicationSummary);
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
        if (getApplicationSummary() != null)
            sb.append("ApplicationSummary: ").append(getApplicationSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateApplicationResult == false)
            return false;
        CreateApplicationResult other = (CreateApplicationResult) obj;
        if (other.getApplicationSummary() == null ^ this.getApplicationSummary() == null)
            return false;
        if (other.getApplicationSummary() != null && other.getApplicationSummary().equals(this.getApplicationSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationSummary() == null) ? 0 : getApplicationSummary().hashCode());
        return hashCode;
    }

    @Override
    public CreateApplicationResult clone() {
        try {
            return (CreateApplicationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
