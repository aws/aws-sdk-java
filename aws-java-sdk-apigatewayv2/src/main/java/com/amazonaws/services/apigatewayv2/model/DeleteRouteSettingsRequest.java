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

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteRouteSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The API identifier.
     * </p>
     */
    private String apiId;
    /**
     * <p>
     * The route key.
     * </p>
     */
    private String routeKey;
    /**
     * <p>
     * The stage name. Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum length is
     * 128 characters.
     * </p>
     */
    private String stageName;

    /**
     * <p>
     * The API identifier.
     * </p>
     * 
     * @param apiId
     *        The API identifier.
     */

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * The API identifier.
     * </p>
     * 
     * @return The API identifier.
     */

    public String getApiId() {
        return this.apiId;
    }

    /**
     * <p>
     * The API identifier.
     * </p>
     * 
     * @param apiId
     *        The API identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRouteSettingsRequest withApiId(String apiId) {
        setApiId(apiId);
        return this;
    }

    /**
     * <p>
     * The route key.
     * </p>
     * 
     * @param routeKey
     *        The route key.
     */

    public void setRouteKey(String routeKey) {
        this.routeKey = routeKey;
    }

    /**
     * <p>
     * The route key.
     * </p>
     * 
     * @return The route key.
     */

    public String getRouteKey() {
        return this.routeKey;
    }

    /**
     * <p>
     * The route key.
     * </p>
     * 
     * @param routeKey
     *        The route key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRouteSettingsRequest withRouteKey(String routeKey) {
        setRouteKey(routeKey);
        return this;
    }

    /**
     * <p>
     * The stage name. Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum length is
     * 128 characters.
     * </p>
     * 
     * @param stageName
     *        The stage name. Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum
     *        length is 128 characters.
     */

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The stage name. Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum length is
     * 128 characters.
     * </p>
     * 
     * @return The stage name. Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum
     *         length is 128 characters.
     */

    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * The stage name. Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum length is
     * 128 characters.
     * </p>
     * 
     * @param stageName
     *        The stage name. Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum
     *        length is 128 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRouteSettingsRequest withStageName(String stageName) {
        setStageName(stageName);
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
        if (getApiId() != null)
            sb.append("ApiId: ").append(getApiId()).append(",");
        if (getRouteKey() != null)
            sb.append("RouteKey: ").append(getRouteKey()).append(",");
        if (getStageName() != null)
            sb.append("StageName: ").append(getStageName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRouteSettingsRequest == false)
            return false;
        DeleteRouteSettingsRequest other = (DeleteRouteSettingsRequest) obj;
        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getRouteKey() == null ^ this.getRouteKey() == null)
            return false;
        if (other.getRouteKey() != null && other.getRouteKey().equals(this.getRouteKey()) == false)
            return false;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null && other.getStageName().equals(this.getStageName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode + ((getRouteKey() == null) ? 0 : getRouteKey().hashCode());
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRouteSettingsRequest clone() {
        return (DeleteRouteSettingsRequest) super.clone();
    }

}
