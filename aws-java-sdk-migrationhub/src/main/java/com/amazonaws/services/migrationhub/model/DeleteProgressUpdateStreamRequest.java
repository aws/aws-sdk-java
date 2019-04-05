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
package com.amazonaws.services.migrationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/DeleteProgressUpdateStream"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteProgressUpdateStreamRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the ProgressUpdateStream.
     * </p>
     */
    private String progressUpdateStreamName;
    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission
     * to make the call.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The name of the ProgressUpdateStream.
     * </p>
     * 
     * @param progressUpdateStreamName
     *        The name of the ProgressUpdateStream.
     */

    public void setProgressUpdateStreamName(String progressUpdateStreamName) {
        this.progressUpdateStreamName = progressUpdateStreamName;
    }

    /**
     * <p>
     * The name of the ProgressUpdateStream.
     * </p>
     * 
     * @return The name of the ProgressUpdateStream.
     */

    public String getProgressUpdateStreamName() {
        return this.progressUpdateStreamName;
    }

    /**
     * <p>
     * The name of the ProgressUpdateStream.
     * </p>
     * 
     * @param progressUpdateStreamName
     *        The name of the ProgressUpdateStream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProgressUpdateStreamRequest withProgressUpdateStreamName(String progressUpdateStreamName) {
        setProgressUpdateStreamName(progressUpdateStreamName);
        return this;
    }

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission
     * to make the call.
     * </p>
     * 
     * @param dryRun
     *        Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has
     *        permission to make the call.
     */

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission
     * to make the call.
     * </p>
     * 
     * @return Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has
     *         permission to make the call.
     */

    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission
     * to make the call.
     * </p>
     * 
     * @param dryRun
     *        Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has
     *        permission to make the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProgressUpdateStreamRequest withDryRun(Boolean dryRun) {
        setDryRun(dryRun);
        return this;
    }

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission
     * to make the call.
     * </p>
     * 
     * @return Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has
     *         permission to make the call.
     */

    public Boolean isDryRun() {
        return this.dryRun;
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
        if (getProgressUpdateStreamName() != null)
            sb.append("ProgressUpdateStreamName: ").append(getProgressUpdateStreamName()).append(",");
        if (getDryRun() != null)
            sb.append("DryRun: ").append(getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteProgressUpdateStreamRequest == false)
            return false;
        DeleteProgressUpdateStreamRequest other = (DeleteProgressUpdateStreamRequest) obj;
        if (other.getProgressUpdateStreamName() == null ^ this.getProgressUpdateStreamName() == null)
            return false;
        if (other.getProgressUpdateStreamName() != null && other.getProgressUpdateStreamName().equals(this.getProgressUpdateStreamName()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProgressUpdateStreamName() == null) ? 0 : getProgressUpdateStreamName().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public DeleteProgressUpdateStreamRequest clone() {
        return (DeleteProgressUpdateStreamRequest) super.clone();
    }

}
