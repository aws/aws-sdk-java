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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateCodeSigningConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCodeSigningConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Descriptive name for this code signing configuration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Signing profiles for this code signing configuration.
     * </p>
     */
    private AllowedPublishers allowedPublishers;
    /**
     * <p>
     * The code signing policies define the actions to take if the validation checks fail.
     * </p>
     */
    private CodeSigningPolicies codeSigningPolicies;

    /**
     * <p>
     * Descriptive name for this code signing configuration.
     * </p>
     * 
     * @param description
     *        Descriptive name for this code signing configuration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Descriptive name for this code signing configuration.
     * </p>
     * 
     * @return Descriptive name for this code signing configuration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Descriptive name for this code signing configuration.
     * </p>
     * 
     * @param description
     *        Descriptive name for this code signing configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCodeSigningConfigRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Signing profiles for this code signing configuration.
     * </p>
     * 
     * @param allowedPublishers
     *        Signing profiles for this code signing configuration.
     */

    public void setAllowedPublishers(AllowedPublishers allowedPublishers) {
        this.allowedPublishers = allowedPublishers;
    }

    /**
     * <p>
     * Signing profiles for this code signing configuration.
     * </p>
     * 
     * @return Signing profiles for this code signing configuration.
     */

    public AllowedPublishers getAllowedPublishers() {
        return this.allowedPublishers;
    }

    /**
     * <p>
     * Signing profiles for this code signing configuration.
     * </p>
     * 
     * @param allowedPublishers
     *        Signing profiles for this code signing configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCodeSigningConfigRequest withAllowedPublishers(AllowedPublishers allowedPublishers) {
        setAllowedPublishers(allowedPublishers);
        return this;
    }

    /**
     * <p>
     * The code signing policies define the actions to take if the validation checks fail.
     * </p>
     * 
     * @param codeSigningPolicies
     *        The code signing policies define the actions to take if the validation checks fail.
     */

    public void setCodeSigningPolicies(CodeSigningPolicies codeSigningPolicies) {
        this.codeSigningPolicies = codeSigningPolicies;
    }

    /**
     * <p>
     * The code signing policies define the actions to take if the validation checks fail.
     * </p>
     * 
     * @return The code signing policies define the actions to take if the validation checks fail.
     */

    public CodeSigningPolicies getCodeSigningPolicies() {
        return this.codeSigningPolicies;
    }

    /**
     * <p>
     * The code signing policies define the actions to take if the validation checks fail.
     * </p>
     * 
     * @param codeSigningPolicies
     *        The code signing policies define the actions to take if the validation checks fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCodeSigningConfigRequest withCodeSigningPolicies(CodeSigningPolicies codeSigningPolicies) {
        setCodeSigningPolicies(codeSigningPolicies);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getAllowedPublishers() != null)
            sb.append("AllowedPublishers: ").append(getAllowedPublishers()).append(",");
        if (getCodeSigningPolicies() != null)
            sb.append("CodeSigningPolicies: ").append(getCodeSigningPolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCodeSigningConfigRequest == false)
            return false;
        CreateCodeSigningConfigRequest other = (CreateCodeSigningConfigRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAllowedPublishers() == null ^ this.getAllowedPublishers() == null)
            return false;
        if (other.getAllowedPublishers() != null && other.getAllowedPublishers().equals(this.getAllowedPublishers()) == false)
            return false;
        if (other.getCodeSigningPolicies() == null ^ this.getCodeSigningPolicies() == null)
            return false;
        if (other.getCodeSigningPolicies() != null && other.getCodeSigningPolicies().equals(this.getCodeSigningPolicies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAllowedPublishers() == null) ? 0 : getAllowedPublishers().hashCode());
        hashCode = prime * hashCode + ((getCodeSigningPolicies() == null) ? 0 : getCodeSigningPolicies().hashCode());
        return hashCode;
    }

    @Override
    public CreateCodeSigningConfigRequest clone() {
        return (CreateCodeSigningConfigRequest) super.clone();
    }

}
