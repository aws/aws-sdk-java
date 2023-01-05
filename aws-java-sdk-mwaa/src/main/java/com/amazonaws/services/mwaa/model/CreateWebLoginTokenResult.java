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
     * The Airflow web server hostname for the environment.
     * </p>
     */
    private String webServerHostname;
    /**
     * <p>
     * An Airflow web server login token.
     * </p>
     */
    private String webToken;

    /**
     * <p>
     * The Airflow web server hostname for the environment.
     * </p>
     * 
     * @param webServerHostname
     *        The Airflow web server hostname for the environment.
     */

    public void setWebServerHostname(String webServerHostname) {
        this.webServerHostname = webServerHostname;
    }

    /**
     * <p>
     * The Airflow web server hostname for the environment.
     * </p>
     * 
     * @return The Airflow web server hostname for the environment.
     */

    public String getWebServerHostname() {
        return this.webServerHostname;
    }

    /**
     * <p>
     * The Airflow web server hostname for the environment.
     * </p>
     * 
     * @param webServerHostname
     *        The Airflow web server hostname for the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWebLoginTokenResult withWebServerHostname(String webServerHostname) {
        setWebServerHostname(webServerHostname);
        return this;
    }

    /**
     * <p>
     * An Airflow web server login token.
     * </p>
     * 
     * @param webToken
     *        An Airflow web server login token.
     */

    public void setWebToken(String webToken) {
        this.webToken = webToken;
    }

    /**
     * <p>
     * An Airflow web server login token.
     * </p>
     * 
     * @return An Airflow web server login token.
     */

    public String getWebToken() {
        return this.webToken;
    }

    /**
     * <p>
     * An Airflow web server login token.
     * </p>
     * 
     * @param webToken
     *        An Airflow web server login token.
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
