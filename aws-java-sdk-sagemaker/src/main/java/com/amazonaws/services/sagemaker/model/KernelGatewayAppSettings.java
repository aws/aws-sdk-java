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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The KernelGateway app settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/KernelGatewayAppSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KernelGatewayAppSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the
     * KernelGateway app.
     * </p>
     * <note>
     * <p>
     * The Amazon SageMaker Studio UI does not use the default instance type value set here. The default instance type
     * set here is used when Apps are created using the Amazon Web Services Command Line Interface or Amazon Web
     * Services CloudFormation and the instance type parameter value is not passed.
     * </p>
     * </note>
     */
    private ResourceSpec defaultResourceSpec;
    /**
     * <p>
     * A list of custom SageMaker images that are configured to run as a KernelGateway app.
     * </p>
     */
    private java.util.List<CustomImage> customImages;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lifecycle Configurations attached to the the user profile or domain.
     * </p>
     * <note>
     * <p>
     * To remove a Lifecycle Config, you must set <code>LifecycleConfigArns</code> to an empty list.
     * </p>
     * </note>
     */
    private java.util.List<String> lifecycleConfigArns;

    /**
     * <p>
     * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the
     * KernelGateway app.
     * </p>
     * <note>
     * <p>
     * The Amazon SageMaker Studio UI does not use the default instance type value set here. The default instance type
     * set here is used when Apps are created using the Amazon Web Services Command Line Interface or Amazon Web
     * Services CloudFormation and the instance type parameter value is not passed.
     * </p>
     * </note>
     * 
     * @param defaultResourceSpec
     *        The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the
     *        KernelGateway app.</p> <note>
     *        <p>
     *        The Amazon SageMaker Studio UI does not use the default instance type value set here. The default instance
     *        type set here is used when Apps are created using the Amazon Web Services Command Line Interface or Amazon
     *        Web Services CloudFormation and the instance type parameter value is not passed.
     *        </p>
     */

    public void setDefaultResourceSpec(ResourceSpec defaultResourceSpec) {
        this.defaultResourceSpec = defaultResourceSpec;
    }

    /**
     * <p>
     * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the
     * KernelGateway app.
     * </p>
     * <note>
     * <p>
     * The Amazon SageMaker Studio UI does not use the default instance type value set here. The default instance type
     * set here is used when Apps are created using the Amazon Web Services Command Line Interface or Amazon Web
     * Services CloudFormation and the instance type parameter value is not passed.
     * </p>
     * </note>
     * 
     * @return The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the
     *         KernelGateway app.</p> <note>
     *         <p>
     *         The Amazon SageMaker Studio UI does not use the default instance type value set here. The default
     *         instance type set here is used when Apps are created using the Amazon Web Services Command Line Interface
     *         or Amazon Web Services CloudFormation and the instance type parameter value is not passed.
     *         </p>
     */

    public ResourceSpec getDefaultResourceSpec() {
        return this.defaultResourceSpec;
    }

    /**
     * <p>
     * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the
     * KernelGateway app.
     * </p>
     * <note>
     * <p>
     * The Amazon SageMaker Studio UI does not use the default instance type value set here. The default instance type
     * set here is used when Apps are created using the Amazon Web Services Command Line Interface or Amazon Web
     * Services CloudFormation and the instance type parameter value is not passed.
     * </p>
     * </note>
     * 
     * @param defaultResourceSpec
     *        The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the
     *        KernelGateway app.</p> <note>
     *        <p>
     *        The Amazon SageMaker Studio UI does not use the default instance type value set here. The default instance
     *        type set here is used when Apps are created using the Amazon Web Services Command Line Interface or Amazon
     *        Web Services CloudFormation and the instance type parameter value is not passed.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KernelGatewayAppSettings withDefaultResourceSpec(ResourceSpec defaultResourceSpec) {
        setDefaultResourceSpec(defaultResourceSpec);
        return this;
    }

    /**
     * <p>
     * A list of custom SageMaker images that are configured to run as a KernelGateway app.
     * </p>
     * 
     * @return A list of custom SageMaker images that are configured to run as a KernelGateway app.
     */

    public java.util.List<CustomImage> getCustomImages() {
        return customImages;
    }

    /**
     * <p>
     * A list of custom SageMaker images that are configured to run as a KernelGateway app.
     * </p>
     * 
     * @param customImages
     *        A list of custom SageMaker images that are configured to run as a KernelGateway app.
     */

    public void setCustomImages(java.util.Collection<CustomImage> customImages) {
        if (customImages == null) {
            this.customImages = null;
            return;
        }

        this.customImages = new java.util.ArrayList<CustomImage>(customImages);
    }

    /**
     * <p>
     * A list of custom SageMaker images that are configured to run as a KernelGateway app.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomImages(java.util.Collection)} or {@link #withCustomImages(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param customImages
     *        A list of custom SageMaker images that are configured to run as a KernelGateway app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KernelGatewayAppSettings withCustomImages(CustomImage... customImages) {
        if (this.customImages == null) {
            setCustomImages(new java.util.ArrayList<CustomImage>(customImages.length));
        }
        for (CustomImage ele : customImages) {
            this.customImages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of custom SageMaker images that are configured to run as a KernelGateway app.
     * </p>
     * 
     * @param customImages
     *        A list of custom SageMaker images that are configured to run as a KernelGateway app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KernelGatewayAppSettings withCustomImages(java.util.Collection<CustomImage> customImages) {
        setCustomImages(customImages);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lifecycle Configurations attached to the the user profile or domain.
     * </p>
     * <note>
     * <p>
     * To remove a Lifecycle Config, you must set <code>LifecycleConfigArns</code> to an empty list.
     * </p>
     * </note>
     * 
     * @return The Amazon Resource Name (ARN) of the Lifecycle Configurations attached to the the user profile or
     *         domain.</p> <note>
     *         <p>
     *         To remove a Lifecycle Config, you must set <code>LifecycleConfigArns</code> to an empty list.
     *         </p>
     */

    public java.util.List<String> getLifecycleConfigArns() {
        return lifecycleConfigArns;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lifecycle Configurations attached to the the user profile or domain.
     * </p>
     * <note>
     * <p>
     * To remove a Lifecycle Config, you must set <code>LifecycleConfigArns</code> to an empty list.
     * </p>
     * </note>
     * 
     * @param lifecycleConfigArns
     *        The Amazon Resource Name (ARN) of the Lifecycle Configurations attached to the the user profile or
     *        domain.</p> <note>
     *        <p>
     *        To remove a Lifecycle Config, you must set <code>LifecycleConfigArns</code> to an empty list.
     *        </p>
     */

    public void setLifecycleConfigArns(java.util.Collection<String> lifecycleConfigArns) {
        if (lifecycleConfigArns == null) {
            this.lifecycleConfigArns = null;
            return;
        }

        this.lifecycleConfigArns = new java.util.ArrayList<String>(lifecycleConfigArns);
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lifecycle Configurations attached to the the user profile or domain.
     * </p>
     * <note>
     * <p>
     * To remove a Lifecycle Config, you must set <code>LifecycleConfigArns</code> to an empty list.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLifecycleConfigArns(java.util.Collection)} or {@link #withLifecycleConfigArns(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param lifecycleConfigArns
     *        The Amazon Resource Name (ARN) of the Lifecycle Configurations attached to the the user profile or
     *        domain.</p> <note>
     *        <p>
     *        To remove a Lifecycle Config, you must set <code>LifecycleConfigArns</code> to an empty list.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KernelGatewayAppSettings withLifecycleConfigArns(String... lifecycleConfigArns) {
        if (this.lifecycleConfigArns == null) {
            setLifecycleConfigArns(new java.util.ArrayList<String>(lifecycleConfigArns.length));
        }
        for (String ele : lifecycleConfigArns) {
            this.lifecycleConfigArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lifecycle Configurations attached to the the user profile or domain.
     * </p>
     * <note>
     * <p>
     * To remove a Lifecycle Config, you must set <code>LifecycleConfigArns</code> to an empty list.
     * </p>
     * </note>
     * 
     * @param lifecycleConfigArns
     *        The Amazon Resource Name (ARN) of the Lifecycle Configurations attached to the the user profile or
     *        domain.</p> <note>
     *        <p>
     *        To remove a Lifecycle Config, you must set <code>LifecycleConfigArns</code> to an empty list.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KernelGatewayAppSettings withLifecycleConfigArns(java.util.Collection<String> lifecycleConfigArns) {
        setLifecycleConfigArns(lifecycleConfigArns);
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
        if (getDefaultResourceSpec() != null)
            sb.append("DefaultResourceSpec: ").append(getDefaultResourceSpec()).append(",");
        if (getCustomImages() != null)
            sb.append("CustomImages: ").append(getCustomImages()).append(",");
        if (getLifecycleConfigArns() != null)
            sb.append("LifecycleConfigArns: ").append(getLifecycleConfigArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KernelGatewayAppSettings == false)
            return false;
        KernelGatewayAppSettings other = (KernelGatewayAppSettings) obj;
        if (other.getDefaultResourceSpec() == null ^ this.getDefaultResourceSpec() == null)
            return false;
        if (other.getDefaultResourceSpec() != null && other.getDefaultResourceSpec().equals(this.getDefaultResourceSpec()) == false)
            return false;
        if (other.getCustomImages() == null ^ this.getCustomImages() == null)
            return false;
        if (other.getCustomImages() != null && other.getCustomImages().equals(this.getCustomImages()) == false)
            return false;
        if (other.getLifecycleConfigArns() == null ^ this.getLifecycleConfigArns() == null)
            return false;
        if (other.getLifecycleConfigArns() != null && other.getLifecycleConfigArns().equals(this.getLifecycleConfigArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultResourceSpec() == null) ? 0 : getDefaultResourceSpec().hashCode());
        hashCode = prime * hashCode + ((getCustomImages() == null) ? 0 : getCustomImages().hashCode());
        hashCode = prime * hashCode + ((getLifecycleConfigArns() == null) ? 0 : getLifecycleConfigArns().hashCode());
        return hashCode;
    }

    @Override
    public KernelGatewayAppSettings clone() {
        try {
            return (KernelGatewayAppSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.KernelGatewayAppSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
