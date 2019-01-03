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
package com.amazonaws.services.signer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/StartSigningJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSigningJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The S3 bucket that contains the object to sign or a BLOB that contains your raw code.
     * </p>
     */
    private Source source;
    /**
     * <p>
     * The S3 bucket in which to save your signed object. The destination contains the name of your bucket and an
     * optional prefix.
     * </p>
     */
    private Destination destination;
    /**
     * <p>
     * The name of the signing profile.
     * </p>
     */
    private String profileName;
    /**
     * <p>
     * String that identifies the signing request. All calls after the first that use this token return the same
     * response as the first call.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The S3 bucket that contains the object to sign or a BLOB that contains your raw code.
     * </p>
     * 
     * @param source
     *        The S3 bucket that contains the object to sign or a BLOB that contains your raw code.
     */

    public void setSource(Source source) {
        this.source = source;
    }

    /**
     * <p>
     * The S3 bucket that contains the object to sign or a BLOB that contains your raw code.
     * </p>
     * 
     * @return The S3 bucket that contains the object to sign or a BLOB that contains your raw code.
     */

    public Source getSource() {
        return this.source;
    }

    /**
     * <p>
     * The S3 bucket that contains the object to sign or a BLOB that contains your raw code.
     * </p>
     * 
     * @param source
     *        The S3 bucket that contains the object to sign or a BLOB that contains your raw code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSigningJobRequest withSource(Source source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The S3 bucket in which to save your signed object. The destination contains the name of your bucket and an
     * optional prefix.
     * </p>
     * 
     * @param destination
     *        The S3 bucket in which to save your signed object. The destination contains the name of your bucket and an
     *        optional prefix.
     */

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The S3 bucket in which to save your signed object. The destination contains the name of your bucket and an
     * optional prefix.
     * </p>
     * 
     * @return The S3 bucket in which to save your signed object. The destination contains the name of your bucket and
     *         an optional prefix.
     */

    public Destination getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The S3 bucket in which to save your signed object. The destination contains the name of your bucket and an
     * optional prefix.
     * </p>
     * 
     * @param destination
     *        The S3 bucket in which to save your signed object. The destination contains the name of your bucket and an
     *        optional prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSigningJobRequest withDestination(Destination destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The name of the signing profile.
     * </p>
     * 
     * @param profileName
     *        The name of the signing profile.
     */

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    /**
     * <p>
     * The name of the signing profile.
     * </p>
     * 
     * @return The name of the signing profile.
     */

    public String getProfileName() {
        return this.profileName;
    }

    /**
     * <p>
     * The name of the signing profile.
     * </p>
     * 
     * @param profileName
     *        The name of the signing profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSigningJobRequest withProfileName(String profileName) {
        setProfileName(profileName);
        return this;
    }

    /**
     * <p>
     * String that identifies the signing request. All calls after the first that use this token return the same
     * response as the first call.
     * </p>
     * 
     * @param clientRequestToken
     *        String that identifies the signing request. All calls after the first that use this token return the same
     *        response as the first call.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * String that identifies the signing request. All calls after the first that use this token return the same
     * response as the first call.
     * </p>
     * 
     * @return String that identifies the signing request. All calls after the first that use this token return the same
     *         response as the first call.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * String that identifies the signing request. All calls after the first that use this token return the same
     * response as the first call.
     * </p>
     * 
     * @param clientRequestToken
     *        String that identifies the signing request. All calls after the first that use this token return the same
     *        response as the first call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSigningJobRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getProfileName() != null)
            sb.append("ProfileName: ").append(getProfileName()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSigningJobRequest == false)
            return false;
        StartSigningJobRequest other = (StartSigningJobRequest) obj;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getProfileName() == null ^ this.getProfileName() == null)
            return false;
        if (other.getProfileName() != null && other.getProfileName().equals(this.getProfileName()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getProfileName() == null) ? 0 : getProfileName().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public StartSigningJobRequest clone() {
        return (StartSigningJobRequest) super.clone();
    }

}
