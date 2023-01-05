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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/RemoveDraftAppVersionResourceMappings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveDraftAppVersionResourceMappingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information about ARNs,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private String appArn;
    /**
     * <p>
     * The names of the registered applications to remove from the resource mappings.
     * </p>
     */
    private java.util.List<String> appRegistryAppNames;
    /**
     * <p>
     * The names of the CloudFormation stacks to remove from the resource mappings.
     * </p>
     */
    private java.util.List<String> logicalStackNames;
    /**
     * <p>
     * The names of the resource groups to remove from the resource mappings.
     * </p>
     */
    private java.util.List<String> resourceGroupNames;
    /**
     * <p>
     * The names of the resources to remove from the resource mappings.
     * </p>
     */
    private java.util.List<String> resourceNames;
    /**
     * <p>
     * 
     * <pre>
     * <code>&lt;/p&gt; </code>
     * </pre>
     */
    private java.util.List<String> terraformSourceNames;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information about ARNs,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param appArn
     *        The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     *        :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information
     *        about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     *        Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public void setAppArn(String appArn) {
        this.appArn = appArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information about ARNs,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     *         :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information
     *         about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     *         Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public String getAppArn() {
        return this.appArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information about ARNs,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param appArn
     *        The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     *        :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information
     *        about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     *        Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveDraftAppVersionResourceMappingsRequest withAppArn(String appArn) {
        setAppArn(appArn);
        return this;
    }

    /**
     * <p>
     * The names of the registered applications to remove from the resource mappings.
     * </p>
     * 
     * @return The names of the registered applications to remove from the resource mappings.
     */

    public java.util.List<String> getAppRegistryAppNames() {
        return appRegistryAppNames;
    }

    /**
     * <p>
     * The names of the registered applications to remove from the resource mappings.
     * </p>
     * 
     * @param appRegistryAppNames
     *        The names of the registered applications to remove from the resource mappings.
     */

    public void setAppRegistryAppNames(java.util.Collection<String> appRegistryAppNames) {
        if (appRegistryAppNames == null) {
            this.appRegistryAppNames = null;
            return;
        }

        this.appRegistryAppNames = new java.util.ArrayList<String>(appRegistryAppNames);
    }

    /**
     * <p>
     * The names of the registered applications to remove from the resource mappings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAppRegistryAppNames(java.util.Collection)} or {@link #withAppRegistryAppNames(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param appRegistryAppNames
     *        The names of the registered applications to remove from the resource mappings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveDraftAppVersionResourceMappingsRequest withAppRegistryAppNames(String... appRegistryAppNames) {
        if (this.appRegistryAppNames == null) {
            setAppRegistryAppNames(new java.util.ArrayList<String>(appRegistryAppNames.length));
        }
        for (String ele : appRegistryAppNames) {
            this.appRegistryAppNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the registered applications to remove from the resource mappings.
     * </p>
     * 
     * @param appRegistryAppNames
     *        The names of the registered applications to remove from the resource mappings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveDraftAppVersionResourceMappingsRequest withAppRegistryAppNames(java.util.Collection<String> appRegistryAppNames) {
        setAppRegistryAppNames(appRegistryAppNames);
        return this;
    }

    /**
     * <p>
     * The names of the CloudFormation stacks to remove from the resource mappings.
     * </p>
     * 
     * @return The names of the CloudFormation stacks to remove from the resource mappings.
     */

    public java.util.List<String> getLogicalStackNames() {
        return logicalStackNames;
    }

    /**
     * <p>
     * The names of the CloudFormation stacks to remove from the resource mappings.
     * </p>
     * 
     * @param logicalStackNames
     *        The names of the CloudFormation stacks to remove from the resource mappings.
     */

    public void setLogicalStackNames(java.util.Collection<String> logicalStackNames) {
        if (logicalStackNames == null) {
            this.logicalStackNames = null;
            return;
        }

        this.logicalStackNames = new java.util.ArrayList<String>(logicalStackNames);
    }

    /**
     * <p>
     * The names of the CloudFormation stacks to remove from the resource mappings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogicalStackNames(java.util.Collection)} or {@link #withLogicalStackNames(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param logicalStackNames
     *        The names of the CloudFormation stacks to remove from the resource mappings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveDraftAppVersionResourceMappingsRequest withLogicalStackNames(String... logicalStackNames) {
        if (this.logicalStackNames == null) {
            setLogicalStackNames(new java.util.ArrayList<String>(logicalStackNames.length));
        }
        for (String ele : logicalStackNames) {
            this.logicalStackNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the CloudFormation stacks to remove from the resource mappings.
     * </p>
     * 
     * @param logicalStackNames
     *        The names of the CloudFormation stacks to remove from the resource mappings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveDraftAppVersionResourceMappingsRequest withLogicalStackNames(java.util.Collection<String> logicalStackNames) {
        setLogicalStackNames(logicalStackNames);
        return this;
    }

    /**
     * <p>
     * The names of the resource groups to remove from the resource mappings.
     * </p>
     * 
     * @return The names of the resource groups to remove from the resource mappings.
     */

    public java.util.List<String> getResourceGroupNames() {
        return resourceGroupNames;
    }

    /**
     * <p>
     * The names of the resource groups to remove from the resource mappings.
     * </p>
     * 
     * @param resourceGroupNames
     *        The names of the resource groups to remove from the resource mappings.
     */

    public void setResourceGroupNames(java.util.Collection<String> resourceGroupNames) {
        if (resourceGroupNames == null) {
            this.resourceGroupNames = null;
            return;
        }

        this.resourceGroupNames = new java.util.ArrayList<String>(resourceGroupNames);
    }

    /**
     * <p>
     * The names of the resource groups to remove from the resource mappings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceGroupNames(java.util.Collection)} or {@link #withResourceGroupNames(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param resourceGroupNames
     *        The names of the resource groups to remove from the resource mappings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveDraftAppVersionResourceMappingsRequest withResourceGroupNames(String... resourceGroupNames) {
        if (this.resourceGroupNames == null) {
            setResourceGroupNames(new java.util.ArrayList<String>(resourceGroupNames.length));
        }
        for (String ele : resourceGroupNames) {
            this.resourceGroupNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the resource groups to remove from the resource mappings.
     * </p>
     * 
     * @param resourceGroupNames
     *        The names of the resource groups to remove from the resource mappings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveDraftAppVersionResourceMappingsRequest withResourceGroupNames(java.util.Collection<String> resourceGroupNames) {
        setResourceGroupNames(resourceGroupNames);
        return this;
    }

    /**
     * <p>
     * The names of the resources to remove from the resource mappings.
     * </p>
     * 
     * @return The names of the resources to remove from the resource mappings.
     */

    public java.util.List<String> getResourceNames() {
        return resourceNames;
    }

    /**
     * <p>
     * The names of the resources to remove from the resource mappings.
     * </p>
     * 
     * @param resourceNames
     *        The names of the resources to remove from the resource mappings.
     */

    public void setResourceNames(java.util.Collection<String> resourceNames) {
        if (resourceNames == null) {
            this.resourceNames = null;
            return;
        }

        this.resourceNames = new java.util.ArrayList<String>(resourceNames);
    }

    /**
     * <p>
     * The names of the resources to remove from the resource mappings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceNames(java.util.Collection)} or {@link #withResourceNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceNames
     *        The names of the resources to remove from the resource mappings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveDraftAppVersionResourceMappingsRequest withResourceNames(String... resourceNames) {
        if (this.resourceNames == null) {
            setResourceNames(new java.util.ArrayList<String>(resourceNames.length));
        }
        for (String ele : resourceNames) {
            this.resourceNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the resources to remove from the resource mappings.
     * </p>
     * 
     * @param resourceNames
     *        The names of the resources to remove from the resource mappings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveDraftAppVersionResourceMappingsRequest withResourceNames(java.util.Collection<String> resourceNames) {
        setResourceNames(resourceNames);
        return this;
    }

    /**
     * <p>
     * 
     * <pre>
     * <code>&lt;/p&gt; </code>
     * </pre>
     * 
     * @return <pre>
     * 
     *         <code>&lt;/p&gt; </code>
     */

    public java.util.List<String> getTerraformSourceNames() {
        return terraformSourceNames;
    }

    /**
     * <p>
     * 
     * <pre>
     * <code>&lt;/p&gt; </code>
     * </pre>
     * 
     * @param terraformSourceNames
     *        <pre>
     * 
     *        <code>&lt;/p&gt; </code>
     */

    public void setTerraformSourceNames(java.util.Collection<String> terraformSourceNames) {
        if (terraformSourceNames == null) {
            this.terraformSourceNames = null;
            return;
        }

        this.terraformSourceNames = new java.util.ArrayList<String>(terraformSourceNames);
    }

    /**
     * <p>
     * 
     * <pre>
     * <code>&lt;/p&gt; </code>
     * </pre>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTerraformSourceNames(java.util.Collection)} or {@link #withTerraformSourceNames(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param terraformSourceNames
     *        <pre>
     * <code>&lt;/p&gt; </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveDraftAppVersionResourceMappingsRequest withTerraformSourceNames(String... terraformSourceNames) {
        if (this.terraformSourceNames == null) {
            setTerraformSourceNames(new java.util.ArrayList<String>(terraformSourceNames.length));
        }
        for (String ele : terraformSourceNames) {
            this.terraformSourceNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * 
     * <pre>
     * <code>&lt;/p&gt; </code>
     * </pre>
     * 
     * @param terraformSourceNames
     *        <pre>
     * 
     *        <code>&lt;/p&gt; </code> @return Returns a reference to this object so that method calls can be chained
     *        together.
     */

    public RemoveDraftAppVersionResourceMappingsRequest withTerraformSourceNames(java.util.Collection<String> terraformSourceNames) {
        setTerraformSourceNames(terraformSourceNames);
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
        if (getAppArn() != null)
            sb.append("AppArn: ").append(getAppArn()).append(",");
        if (getAppRegistryAppNames() != null)
            sb.append("AppRegistryAppNames: ").append(getAppRegistryAppNames()).append(",");
        if (getLogicalStackNames() != null)
            sb.append("LogicalStackNames: ").append(getLogicalStackNames()).append(",");
        if (getResourceGroupNames() != null)
            sb.append("ResourceGroupNames: ").append(getResourceGroupNames()).append(",");
        if (getResourceNames() != null)
            sb.append("ResourceNames: ").append(getResourceNames()).append(",");
        if (getTerraformSourceNames() != null)
            sb.append("TerraformSourceNames: ").append(getTerraformSourceNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveDraftAppVersionResourceMappingsRequest == false)
            return false;
        RemoveDraftAppVersionResourceMappingsRequest other = (RemoveDraftAppVersionResourceMappingsRequest) obj;
        if (other.getAppArn() == null ^ this.getAppArn() == null)
            return false;
        if (other.getAppArn() != null && other.getAppArn().equals(this.getAppArn()) == false)
            return false;
        if (other.getAppRegistryAppNames() == null ^ this.getAppRegistryAppNames() == null)
            return false;
        if (other.getAppRegistryAppNames() != null && other.getAppRegistryAppNames().equals(this.getAppRegistryAppNames()) == false)
            return false;
        if (other.getLogicalStackNames() == null ^ this.getLogicalStackNames() == null)
            return false;
        if (other.getLogicalStackNames() != null && other.getLogicalStackNames().equals(this.getLogicalStackNames()) == false)
            return false;
        if (other.getResourceGroupNames() == null ^ this.getResourceGroupNames() == null)
            return false;
        if (other.getResourceGroupNames() != null && other.getResourceGroupNames().equals(this.getResourceGroupNames()) == false)
            return false;
        if (other.getResourceNames() == null ^ this.getResourceNames() == null)
            return false;
        if (other.getResourceNames() != null && other.getResourceNames().equals(this.getResourceNames()) == false)
            return false;
        if (other.getTerraformSourceNames() == null ^ this.getTerraformSourceNames() == null)
            return false;
        if (other.getTerraformSourceNames() != null && other.getTerraformSourceNames().equals(this.getTerraformSourceNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppArn() == null) ? 0 : getAppArn().hashCode());
        hashCode = prime * hashCode + ((getAppRegistryAppNames() == null) ? 0 : getAppRegistryAppNames().hashCode());
        hashCode = prime * hashCode + ((getLogicalStackNames() == null) ? 0 : getLogicalStackNames().hashCode());
        hashCode = prime * hashCode + ((getResourceGroupNames() == null) ? 0 : getResourceGroupNames().hashCode());
        hashCode = prime * hashCode + ((getResourceNames() == null) ? 0 : getResourceNames().hashCode());
        hashCode = prime * hashCode + ((getTerraformSourceNames() == null) ? 0 : getTerraformSourceNames().hashCode());
        return hashCode;
    }

    @Override
    public RemoveDraftAppVersionResourceMappingsRequest clone() {
        return (RemoveDraftAppVersionResourceMappingsRequest) super.clone();
    }

}
