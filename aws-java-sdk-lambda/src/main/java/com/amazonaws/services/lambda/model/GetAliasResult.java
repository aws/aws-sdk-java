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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Provides configuration information about a Lambda function <a
 * href="https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">alias</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAliasResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alias.
     * </p>
     */
    private String aliasArn;
    /**
     * <p>
     * The name of the alias.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The function version that the alias invokes.
     * </p>
     */
    private String functionVersion;
    /**
     * <p>
     * A description of the alias.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html">routing
     * configuration</a> of the alias.
     * </p>
     */
    private AliasRoutingConfiguration routingConfig;
    /**
     * <p>
     * A unique identifier that changes when you update the alias.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alias.
     * </p>
     * 
     * @param aliasArn
     *        The Amazon Resource Name (ARN) of the alias.
     */

    public void setAliasArn(String aliasArn) {
        this.aliasArn = aliasArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alias.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the alias.
     */

    public String getAliasArn() {
        return this.aliasArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alias.
     * </p>
     * 
     * @param aliasArn
     *        The Amazon Resource Name (ARN) of the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAliasResult withAliasArn(String aliasArn) {
        setAliasArn(aliasArn);
        return this;
    }

    /**
     * <p>
     * The name of the alias.
     * </p>
     * 
     * @param name
     *        The name of the alias.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the alias.
     * </p>
     * 
     * @return The name of the alias.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the alias.
     * </p>
     * 
     * @param name
     *        The name of the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAliasResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The function version that the alias invokes.
     * </p>
     * 
     * @param functionVersion
     *        The function version that the alias invokes.
     */

    public void setFunctionVersion(String functionVersion) {
        this.functionVersion = functionVersion;
    }

    /**
     * <p>
     * The function version that the alias invokes.
     * </p>
     * 
     * @return The function version that the alias invokes.
     */

    public String getFunctionVersion() {
        return this.functionVersion;
    }

    /**
     * <p>
     * The function version that the alias invokes.
     * </p>
     * 
     * @param functionVersion
     *        The function version that the alias invokes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAliasResult withFunctionVersion(String functionVersion) {
        setFunctionVersion(functionVersion);
        return this;
    }

    /**
     * <p>
     * A description of the alias.
     * </p>
     * 
     * @param description
     *        A description of the alias.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the alias.
     * </p>
     * 
     * @return A description of the alias.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the alias.
     * </p>
     * 
     * @param description
     *        A description of the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAliasResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html">routing
     * configuration</a> of the alias.
     * </p>
     * 
     * @param routingConfig
     *        The <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html">routing
     *        configuration</a> of the alias.
     */

    public void setRoutingConfig(AliasRoutingConfiguration routingConfig) {
        this.routingConfig = routingConfig;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html">routing
     * configuration</a> of the alias.
     * </p>
     * 
     * @return The <a
     *         href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html">routing
     *         configuration</a> of the alias.
     */

    public AliasRoutingConfiguration getRoutingConfig() {
        return this.routingConfig;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html">routing
     * configuration</a> of the alias.
     * </p>
     * 
     * @param routingConfig
     *        The <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html">routing
     *        configuration</a> of the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAliasResult withRoutingConfig(AliasRoutingConfiguration routingConfig) {
        setRoutingConfig(routingConfig);
        return this;
    }

    /**
     * <p>
     * A unique identifier that changes when you update the alias.
     * </p>
     * 
     * @param revisionId
     *        A unique identifier that changes when you update the alias.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * A unique identifier that changes when you update the alias.
     * </p>
     * 
     * @return A unique identifier that changes when you update the alias.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * A unique identifier that changes when you update the alias.
     * </p>
     * 
     * @param revisionId
     *        A unique identifier that changes when you update the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAliasResult withRevisionId(String revisionId) {
        setRevisionId(revisionId);
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
        if (getAliasArn() != null)
            sb.append("AliasArn: ").append(getAliasArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getFunctionVersion() != null)
            sb.append("FunctionVersion: ").append(getFunctionVersion()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRoutingConfig() != null)
            sb.append("RoutingConfig: ").append(getRoutingConfig()).append(",");
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAliasResult == false)
            return false;
        GetAliasResult other = (GetAliasResult) obj;
        if (other.getAliasArn() == null ^ this.getAliasArn() == null)
            return false;
        if (other.getAliasArn() != null && other.getAliasArn().equals(this.getAliasArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFunctionVersion() == null ^ this.getFunctionVersion() == null)
            return false;
        if (other.getFunctionVersion() != null && other.getFunctionVersion().equals(this.getFunctionVersion()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRoutingConfig() == null ^ this.getRoutingConfig() == null)
            return false;
        if (other.getRoutingConfig() != null && other.getRoutingConfig().equals(this.getRoutingConfig()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAliasArn() == null) ? 0 : getAliasArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFunctionVersion() == null) ? 0 : getFunctionVersion().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRoutingConfig() == null) ? 0 : getRoutingConfig().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public GetAliasResult clone() {
        try {
            return (GetAliasResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
