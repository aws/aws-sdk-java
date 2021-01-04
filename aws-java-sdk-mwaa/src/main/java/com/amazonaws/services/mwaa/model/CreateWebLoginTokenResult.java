/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mwaa.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/CreateWebLoginToken" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWebLoginTokenResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Create an Airflow Web UI login token response for the provided webserver hostname.
     * </p>
     */
    private String webServerHostname;
    /**
     * <p>
     * Create an Airflow Web UI login token response for the provided JWT token.
     * </p>
     */
    private String webToken;

    /**
     * <p>
     * Create an Airflow Web UI login token response for the provided webserver hostname.
     * </p>
     * 
     * @param webServerHostname
     *        Create an Airflow Web UI login token response for the provided webserver hostname.
     */

    public void setWebServerHostname(String webServerHostname) {
        this.webServerHostname = webServerHostname;
    }

    /**
     * <p>
     * Create an Airflow Web UI login token response for the provided webserver hostname.
     * </p>
     * 
     * @return Create an Airflow Web UI login token response for the provided webserver hostname.
     */

    public String getWebServerHostname() {
        return this.webServerHostname;
    }

    /**
     * <p>
     * Create an Airflow Web UI login token response for the provided webserver hostname.
     * </p>
     * 
     * @param webServerHostname
     *        Create an Airflow Web UI login token response for the provided webserver hostname.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWebLoginTokenResult withWebServerHostname(String webServerHostname) {
        setWebServerHostname(webServerHostname);
        return this;
    }

    /**
     * <p>
     * Create an Airflow Web UI login token response for the provided JWT token.
     * </p>
     * 
     * @param webToken
     *        Create an Airflow Web UI login token response for the provided JWT token.
     */

    public void setWebToken(String webToken) {
        this.webToken = webToken;
    }

    /**
     * <p>
     * Create an Airflow Web UI login token response for the provided JWT token.
     * </p>
     * 
     * @return Create an Airflow Web UI login token response for the provided JWT token.
     */

    public String getWebToken() {
        return this.webToken;
    }

    /**
     * <p>
     * Create an Airflow Web UI login token response for the provided JWT token.
     * </p>
     * 
     * @param webToken
     *        Create an Airflow Web UI login token response for the provided JWT token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWebLoginTokenResult withWebToken(String webToken) {
        setWebToken(webToken);
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
        if (getWebServerHostname() != null)
            sb.append("WebServerHostname: ").append(getWebServerHostname()).append(",");
        if (getWebToken() != null)
            sb.append("WebToken: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWebLoginTokenResult == false)
            return false;
        CreateWebLoginTokenResult other = (CreateWebLoginTokenResult) obj;
        if (other.getWebServerHostname() == null ^ this.getWebServerHostname() == null)
            return false;
        if (other.getWebServerHostname() != null && other.getWebServerHostname().equals(this.getWebServerHostname()) == false)
            return false;
        if (other.getWebToken() == null ^ this.getWebToken() == null)
            return false;
        if (other.getWebToken() != null && other.getWebToken().equals(this.getWebToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebServerHostname() == null) ? 0 : getWebServerHostname().hashCode());
        hashCode = prime * hashCode + ((getWebToken() == null) ? 0 : getWebToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateWebLoginTokenResult clone() {
        try {
            return (CreateWebLoginTokenResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
