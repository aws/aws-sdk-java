/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/GetKinesisStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetKinesisStreamResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String kinesisStreamARN;

    private SessionCredentials credentialsForReadingKinesisStream;

    /**
     * @param kinesisStreamARN
     */

    public void setKinesisStreamARN(String kinesisStreamARN) {
        this.kinesisStreamARN = kinesisStreamARN;
    }

    /**
     * @return
     */

    public String getKinesisStreamARN() {
        return this.kinesisStreamARN;
    }

    /**
     * @param kinesisStreamARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKinesisStreamResult withKinesisStreamARN(String kinesisStreamARN) {
        setKinesisStreamARN(kinesisStreamARN);
        return this;
    }

    /**
     * @param credentialsForReadingKinesisStream
     */

    public void setCredentialsForReadingKinesisStream(SessionCredentials credentialsForReadingKinesisStream) {
        this.credentialsForReadingKinesisStream = credentialsForReadingKinesisStream;
    }

    /**
     * @return
     */

    public SessionCredentials getCredentialsForReadingKinesisStream() {
        return this.credentialsForReadingKinesisStream;
    }

    /**
     * @param credentialsForReadingKinesisStream
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKinesisStreamResult withCredentialsForReadingKinesisStream(SessionCredentials credentialsForReadingKinesisStream) {
        setCredentialsForReadingKinesisStream(credentialsForReadingKinesisStream);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKinesisStreamARN() != null)
            sb.append("KinesisStreamARN: ").append(getKinesisStreamARN()).append(",");
        if (getCredentialsForReadingKinesisStream() != null)
            sb.append("CredentialsForReadingKinesisStream: ").append(getCredentialsForReadingKinesisStream());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetKinesisStreamResult == false)
            return false;
        GetKinesisStreamResult other = (GetKinesisStreamResult) obj;
        if (other.getKinesisStreamARN() == null ^ this.getKinesisStreamARN() == null)
            return false;
        if (other.getKinesisStreamARN() != null && other.getKinesisStreamARN().equals(this.getKinesisStreamARN()) == false)
            return false;
        if (other.getCredentialsForReadingKinesisStream() == null ^ this.getCredentialsForReadingKinesisStream() == null)
            return false;
        if (other.getCredentialsForReadingKinesisStream() != null
                && other.getCredentialsForReadingKinesisStream().equals(this.getCredentialsForReadingKinesisStream()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKinesisStreamARN() == null) ? 0 : getKinesisStreamARN().hashCode());
        hashCode = prime * hashCode + ((getCredentialsForReadingKinesisStream() == null) ? 0 : getCredentialsForReadingKinesisStream().hashCode());
        return hashCode;
    }

    @Override
    public GetKinesisStreamResult clone() {
        try {
            return (GetKinesisStreamResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
