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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreatePresignedNotebookInstanceUrl"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePresignedNotebookInstanceUrlRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the notebook instance.
     * </p>
     */
    private String notebookInstanceName;
    /**
     * <p>
     * The duration of the session, in seconds. The default is 12 hours.
     * </p>
     */
    private Integer sessionExpirationDurationInSeconds;

    /**
     * <p>
     * The name of the notebook instance.
     * </p>
     * 
     * @param notebookInstanceName
     *        The name of the notebook instance.
     */

    public void setNotebookInstanceName(String notebookInstanceName) {
        this.notebookInstanceName = notebookInstanceName;
    }

    /**
     * <p>
     * The name of the notebook instance.
     * </p>
     * 
     * @return The name of the notebook instance.
     */

    public String getNotebookInstanceName() {
        return this.notebookInstanceName;
    }

    /**
     * <p>
     * The name of the notebook instance.
     * </p>
     * 
     * @param notebookInstanceName
     *        The name of the notebook instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePresignedNotebookInstanceUrlRequest withNotebookInstanceName(String notebookInstanceName) {
        setNotebookInstanceName(notebookInstanceName);
        return this;
    }

    /**
     * <p>
     * The duration of the session, in seconds. The default is 12 hours.
     * </p>
     * 
     * @param sessionExpirationDurationInSeconds
     *        The duration of the session, in seconds. The default is 12 hours.
     */

    public void setSessionExpirationDurationInSeconds(Integer sessionExpirationDurationInSeconds) {
        this.sessionExpirationDurationInSeconds = sessionExpirationDurationInSeconds;
    }

    /**
     * <p>
     * The duration of the session, in seconds. The default is 12 hours.
     * </p>
     * 
     * @return The duration of the session, in seconds. The default is 12 hours.
     */

    public Integer getSessionExpirationDurationInSeconds() {
        return this.sessionExpirationDurationInSeconds;
    }

    /**
     * <p>
     * The duration of the session, in seconds. The default is 12 hours.
     * </p>
     * 
     * @param sessionExpirationDurationInSeconds
     *        The duration of the session, in seconds. The default is 12 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePresignedNotebookInstanceUrlRequest withSessionExpirationDurationInSeconds(Integer sessionExpirationDurationInSeconds) {
        setSessionExpirationDurationInSeconds(sessionExpirationDurationInSeconds);
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
        if (getNotebookInstanceName() != null)
            sb.append("NotebookInstanceName: ").append(getNotebookInstanceName()).append(",");
        if (getSessionExpirationDurationInSeconds() != null)
            sb.append("SessionExpirationDurationInSeconds: ").append(getSessionExpirationDurationInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePresignedNotebookInstanceUrlRequest == false)
            return false;
        CreatePresignedNotebookInstanceUrlRequest other = (CreatePresignedNotebookInstanceUrlRequest) obj;
        if (other.getNotebookInstanceName() == null ^ this.getNotebookInstanceName() == null)
            return false;
        if (other.getNotebookInstanceName() != null && other.getNotebookInstanceName().equals(this.getNotebookInstanceName()) == false)
            return false;
        if (other.getSessionExpirationDurationInSeconds() == null ^ this.getSessionExpirationDurationInSeconds() == null)
            return false;
        if (other.getSessionExpirationDurationInSeconds() != null
                && other.getSessionExpirationDurationInSeconds().equals(this.getSessionExpirationDurationInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotebookInstanceName() == null) ? 0 : getNotebookInstanceName().hashCode());
        hashCode = prime * hashCode + ((getSessionExpirationDurationInSeconds() == null) ? 0 : getSessionExpirationDurationInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public CreatePresignedNotebookInstanceUrlRequest clone() {
        return (CreatePresignedNotebookInstanceUrlRequest) super.clone();
    }

}
