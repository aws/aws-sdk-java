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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request to get the textual content of a specific email message stored in an archive.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetArchiveMessageContent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetArchiveMessageContentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the archived email message.
     * </p>
     */
    private String archivedMessageId;

    /**
     * <p>
     * The unique identifier of the archived email message.
     * </p>
     * 
     * @param archivedMessageId
     *        The unique identifier of the archived email message.
     */

    public void setArchivedMessageId(String archivedMessageId) {
        this.archivedMessageId = archivedMessageId;
    }

    /**
     * <p>
     * The unique identifier of the archived email message.
     * </p>
     * 
     * @return The unique identifier of the archived email message.
     */

    public String getArchivedMessageId() {
        return this.archivedMessageId;
    }

    /**
     * <p>
     * The unique identifier of the archived email message.
     * </p>
     * 
     * @param archivedMessageId
     *        The unique identifier of the archived email message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetArchiveMessageContentRequest withArchivedMessageId(String archivedMessageId) {
        setArchivedMessageId(archivedMessageId);
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
        if (getArchivedMessageId() != null)
            sb.append("ArchivedMessageId: ").append(getArchivedMessageId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetArchiveMessageContentRequest == false)
            return false;
        GetArchiveMessageContentRequest other = (GetArchiveMessageContentRequest) obj;
        if (other.getArchivedMessageId() == null ^ this.getArchivedMessageId() == null)
            return false;
        if (other.getArchivedMessageId() != null && other.getArchivedMessageId().equals(this.getArchivedMessageId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArchivedMessageId() == null) ? 0 : getArchivedMessageId().hashCode());
        return hashCode;
    }

    @Override
    public GetArchiveMessageContentRequest clone() {
        return (GetArchiveMessageContentRequest) super.clone();
    }

}
