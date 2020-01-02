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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateCampaign" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCampaignRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the new campaign. The campaign name must be unique within your account.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution version to deploy.
     * </p>
     */
    private String solutionVersionArn;
    /**
     * <p>
     * Specifies the requested minimum provisioned transactions (recommendations) per second that Amazon Personalize
     * will support.
     * </p>
     */
    private Integer minProvisionedTPS;

    /**
     * <p>
     * A name for the new campaign. The campaign name must be unique within your account.
     * </p>
     * 
     * @param name
     *        A name for the new campaign. The campaign name must be unique within your account.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the new campaign. The campaign name must be unique within your account.
     * </p>
     * 
     * @return A name for the new campaign. The campaign name must be unique within your account.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the new campaign. The campaign name must be unique within your account.
     * </p>
     * 
     * @param name
     *        A name for the new campaign. The campaign name must be unique within your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCampaignRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution version to deploy.
     * </p>
     * 
     * @param solutionVersionArn
     *        The Amazon Resource Name (ARN) of the solution version to deploy.
     */

    public void setSolutionVersionArn(String solutionVersionArn) {
        this.solutionVersionArn = solutionVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution version to deploy.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the solution version to deploy.
     */

    public String getSolutionVersionArn() {
        return this.solutionVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution version to deploy.
     * </p>
     * 
     * @param solutionVersionArn
     *        The Amazon Resource Name (ARN) of the solution version to deploy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCampaignRequest withSolutionVersionArn(String solutionVersionArn) {
        setSolutionVersionArn(solutionVersionArn);
        return this;
    }

    /**
     * <p>
     * Specifies the requested minimum provisioned transactions (recommendations) per second that Amazon Personalize
     * will support.
     * </p>
     * 
     * @param minProvisionedTPS
     *        Specifies the requested minimum provisioned transactions (recommendations) per second that Amazon
     *        Personalize will support.
     */

    public void setMinProvisionedTPS(Integer minProvisionedTPS) {
        this.minProvisionedTPS = minProvisionedTPS;
    }

    /**
     * <p>
     * Specifies the requested minimum provisioned transactions (recommendations) per second that Amazon Personalize
     * will support.
     * </p>
     * 
     * @return Specifies the requested minimum provisioned transactions (recommendations) per second that Amazon
     *         Personalize will support.
     */

    public Integer getMinProvisionedTPS() {
        return this.minProvisionedTPS;
    }

    /**
     * <p>
     * Specifies the requested minimum provisioned transactions (recommendations) per second that Amazon Personalize
     * will support.
     * </p>
     * 
     * @param minProvisionedTPS
     *        Specifies the requested minimum provisioned transactions (recommendations) per second that Amazon
     *        Personalize will support.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCampaignRequest withMinProvisionedTPS(Integer minProvisionedTPS) {
        setMinProvisionedTPS(minProvisionedTPS);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSolutionVersionArn() != null)
            sb.append("SolutionVersionArn: ").append(getSolutionVersionArn()).append(",");
        if (getMinProvisionedTPS() != null)
            sb.append("MinProvisionedTPS: ").append(getMinProvisionedTPS());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCampaignRequest == false)
            return false;
        CreateCampaignRequest other = (CreateCampaignRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSolutionVersionArn() == null ^ this.getSolutionVersionArn() == null)
            return false;
        if (other.getSolutionVersionArn() != null && other.getSolutionVersionArn().equals(this.getSolutionVersionArn()) == false)
            return false;
        if (other.getMinProvisionedTPS() == null ^ this.getMinProvisionedTPS() == null)
            return false;
        if (other.getMinProvisionedTPS() != null && other.getMinProvisionedTPS().equals(this.getMinProvisionedTPS()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSolutionVersionArn() == null) ? 0 : getSolutionVersionArn().hashCode());
        hashCode = prime * hashCode + ((getMinProvisionedTPS() == null) ? 0 : getMinProvisionedTPS().hashCode());
        return hashCode;
    }

    @Override
    public CreateCampaignRequest clone() {
        return (CreateCampaignRequest) super.clone();
    }

}
