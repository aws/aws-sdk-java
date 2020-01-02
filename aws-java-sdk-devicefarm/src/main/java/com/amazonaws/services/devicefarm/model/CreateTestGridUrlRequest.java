/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateTestGridUrl" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTestGridUrlRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ARN (from <a>CreateTestGridProject</a> or <a>ListTestGridProjects</a>) to associate with the short-term URL.
     * </p>
     */
    private String projectArn;
    /**
     * <p>
     * Lifetime, in seconds, of the URL.
     * </p>
     */
    private Integer expiresInSeconds;

    /**
     * <p>
     * ARN (from <a>CreateTestGridProject</a> or <a>ListTestGridProjects</a>) to associate with the short-term URL.
     * </p>
     * 
     * @param projectArn
     *        ARN (from <a>CreateTestGridProject</a> or <a>ListTestGridProjects</a>) to associate with the short-term
     *        URL.
     */

    public void setProjectArn(String projectArn) {
        this.projectArn = projectArn;
    }

    /**
     * <p>
     * ARN (from <a>CreateTestGridProject</a> or <a>ListTestGridProjects</a>) to associate with the short-term URL.
     * </p>
     * 
     * @return ARN (from <a>CreateTestGridProject</a> or <a>ListTestGridProjects</a>) to associate with the short-term
     *         URL.
     */

    public String getProjectArn() {
        return this.projectArn;
    }

    /**
     * <p>
     * ARN (from <a>CreateTestGridProject</a> or <a>ListTestGridProjects</a>) to associate with the short-term URL.
     * </p>
     * 
     * @param projectArn
     *        ARN (from <a>CreateTestGridProject</a> or <a>ListTestGridProjects</a>) to associate with the short-term
     *        URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTestGridUrlRequest withProjectArn(String projectArn) {
        setProjectArn(projectArn);
        return this;
    }

    /**
     * <p>
     * Lifetime, in seconds, of the URL.
     * </p>
     * 
     * @param expiresInSeconds
     *        Lifetime, in seconds, of the URL.
     */

    public void setExpiresInSeconds(Integer expiresInSeconds) {
        this.expiresInSeconds = expiresInSeconds;
    }

    /**
     * <p>
     * Lifetime, in seconds, of the URL.
     * </p>
     * 
     * @return Lifetime, in seconds, of the URL.
     */

    public Integer getExpiresInSeconds() {
        return this.expiresInSeconds;
    }

    /**
     * <p>
     * Lifetime, in seconds, of the URL.
     * </p>
     * 
     * @param expiresInSeconds
     *        Lifetime, in seconds, of the URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTestGridUrlRequest withExpiresInSeconds(Integer expiresInSeconds) {
        setExpiresInSeconds(expiresInSeconds);
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
        if (getProjectArn() != null)
            sb.append("ProjectArn: ").append(getProjectArn()).append(",");
        if (getExpiresInSeconds() != null)
            sb.append("ExpiresInSeconds: ").append(getExpiresInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTestGridUrlRequest == false)
            return false;
        CreateTestGridUrlRequest other = (CreateTestGridUrlRequest) obj;
        if (other.getProjectArn() == null ^ this.getProjectArn() == null)
            return false;
        if (other.getProjectArn() != null && other.getProjectArn().equals(this.getProjectArn()) == false)
            return false;
        if (other.getExpiresInSeconds() == null ^ this.getExpiresInSeconds() == null)
            return false;
        if (other.getExpiresInSeconds() != null && other.getExpiresInSeconds().equals(this.getExpiresInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectArn() == null) ? 0 : getProjectArn().hashCode());
        hashCode = prime * hashCode + ((getExpiresInSeconds() == null) ? 0 : getExpiresInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public CreateTestGridUrlRequest clone() {
        return (CreateTestGridUrlRequest) super.clone();
    }

}
