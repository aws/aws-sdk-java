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
package com.amazonaws.services.apigatewayv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportApiRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Represents the base path of the imported API. Supported only for HTTP APIs.
     * </p>
     */
    private String basepath;
    /**
     * <p>
     * The OpenAPI definition. Supported only for HTTP APIs.
     * </p>
     */
    private String body;
    /**
     * <p>
     * Specifies whether to rollback the API creation (true) or not (false) when a warning is encountered. The default
     * value is false.
     * </p>
     */
    private Boolean failOnWarnings;

    /**
     * <p>
     * Represents the base path of the imported API. Supported only for HTTP APIs.
     * </p>
     * 
     * @param basepath
     *        Represents the base path of the imported API. Supported only for HTTP APIs.
     */

    public void setBasepath(String basepath) {
        this.basepath = basepath;
    }

    /**
     * <p>
     * Represents the base path of the imported API. Supported only for HTTP APIs.
     * </p>
     * 
     * @return Represents the base path of the imported API. Supported only for HTTP APIs.
     */

    public String getBasepath() {
        return this.basepath;
    }

    /**
     * <p>
     * Represents the base path of the imported API. Supported only for HTTP APIs.
     * </p>
     * 
     * @param basepath
     *        Represents the base path of the imported API. Supported only for HTTP APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportApiRequest withBasepath(String basepath) {
        setBasepath(basepath);
        return this;
    }

    /**
     * <p>
     * The OpenAPI definition. Supported only for HTTP APIs.
     * </p>
     * 
     * @param body
     *        The OpenAPI definition. Supported only for HTTP APIs.
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The OpenAPI definition. Supported only for HTTP APIs.
     * </p>
     * 
     * @return The OpenAPI definition. Supported only for HTTP APIs.
     */

    public String getBody() {
        return this.body;
    }

    /**
     * <p>
     * The OpenAPI definition. Supported only for HTTP APIs.
     * </p>
     * 
     * @param body
     *        The OpenAPI definition. Supported only for HTTP APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportApiRequest withBody(String body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * Specifies whether to rollback the API creation (true) or not (false) when a warning is encountered. The default
     * value is false.
     * </p>
     * 
     * @param failOnWarnings
     *        Specifies whether to rollback the API creation (true) or not (false) when a warning is encountered. The
     *        default value is false.
     */

    public void setFailOnWarnings(Boolean failOnWarnings) {
        this.failOnWarnings = failOnWarnings;
    }

    /**
     * <p>
     * Specifies whether to rollback the API creation (true) or not (false) when a warning is encountered. The default
     * value is false.
     * </p>
     * 
     * @return Specifies whether to rollback the API creation (true) or not (false) when a warning is encountered. The
     *         default value is false.
     */

    public Boolean getFailOnWarnings() {
        return this.failOnWarnings;
    }

    /**
     * <p>
     * Specifies whether to rollback the API creation (true) or not (false) when a warning is encountered. The default
     * value is false.
     * </p>
     * 
     * @param failOnWarnings
     *        Specifies whether to rollback the API creation (true) or not (false) when a warning is encountered. The
     *        default value is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportApiRequest withFailOnWarnings(Boolean failOnWarnings) {
        setFailOnWarnings(failOnWarnings);
        return this;
    }

    /**
     * <p>
     * Specifies whether to rollback the API creation (true) or not (false) when a warning is encountered. The default
     * value is false.
     * </p>
     * 
     * @return Specifies whether to rollback the API creation (true) or not (false) when a warning is encountered. The
     *         default value is false.
     */

    public Boolean isFailOnWarnings() {
        return this.failOnWarnings;
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
        if (getBasepath() != null)
            sb.append("Basepath: ").append(getBasepath()).append(",");
        if (getBody() != null)
            sb.append("Body: ").append(getBody()).append(",");
        if (getFailOnWarnings() != null)
            sb.append("FailOnWarnings: ").append(getFailOnWarnings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportApiRequest == false)
            return false;
        ImportApiRequest other = (ImportApiRequest) obj;
        if (other.getBasepath() == null ^ this.getBasepath() == null)
            return false;
        if (other.getBasepath() != null && other.getBasepath().equals(this.getBasepath()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getFailOnWarnings() == null ^ this.getFailOnWarnings() == null)
            return false;
        if (other.getFailOnWarnings() != null && other.getFailOnWarnings().equals(this.getFailOnWarnings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBasepath() == null) ? 0 : getBasepath().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getFailOnWarnings() == null) ? 0 : getFailOnWarnings().hashCode());
        return hashCode;
    }

    @Override
    public ImportApiRequest clone() {
        return (ImportApiRequest) super.clone();
    }

}
