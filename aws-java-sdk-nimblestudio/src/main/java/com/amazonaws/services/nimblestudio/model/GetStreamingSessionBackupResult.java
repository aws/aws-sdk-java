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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetStreamingSessionBackup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetStreamingSessionBackupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the streaming session backup.
     * </p>
     */
    private StreamingSessionBackup streamingSessionBackup;

    /**
     * <p>
     * Information about the streaming session backup.
     * </p>
     * 
     * @param streamingSessionBackup
     *        Information about the streaming session backup.
     */

    public void setStreamingSessionBackup(StreamingSessionBackup streamingSessionBackup) {
        this.streamingSessionBackup = streamingSessionBackup;
    }

    /**
     * <p>
     * Information about the streaming session backup.
     * </p>
     * 
     * @return Information about the streaming session backup.
     */

    public StreamingSessionBackup getStreamingSessionBackup() {
        return this.streamingSessionBackup;
    }

    /**
     * <p>
     * Information about the streaming session backup.
     * </p>
     * 
     * @param streamingSessionBackup
     *        Information about the streaming session backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStreamingSessionBackupResult withStreamingSessionBackup(StreamingSessionBackup streamingSessionBackup) {
        setStreamingSessionBackup(streamingSessionBackup);
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
        if (getStreamingSessionBackup() != null)
            sb.append("StreamingSessionBackup: ").append(getStreamingSessionBackup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetStreamingSessionBackupResult == false)
            return false;
        GetStreamingSessionBackupResult other = (GetStreamingSessionBackupResult) obj;
        if (other.getStreamingSessionBackup() == null ^ this.getStreamingSessionBackup() == null)
            return false;
        if (other.getStreamingSessionBackup() != null && other.getStreamingSessionBackup().equals(this.getStreamingSessionBackup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamingSessionBackup() == null) ? 0 : getStreamingSessionBackup().hashCode());
        return hashCode;
    }

    @Override
    public GetStreamingSessionBackupResult clone() {
        try {
            return (GetStreamingSessionBackupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
