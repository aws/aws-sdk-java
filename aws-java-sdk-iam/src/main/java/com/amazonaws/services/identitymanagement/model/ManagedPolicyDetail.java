/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about a managed policy, including the policy's
 * ARN, versions, and the number of principal entities (users, groups,
 * and roles) that the policy is attached to.
 * </p>
 * <p>
 * This data type is used as a response element in the
 * GetAccountAuthorizationDetails action.
 * </p>
 * <p>
 * For more information about managed policies, see
 * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
 * in the <i>Using IAM</i> guide.
 * </p>
 */
public class ManagedPolicyDetail implements Serializable, Cloneable {

    /**
     * The friendly name (not ARN) identifying the policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String policyName;

    /**
     * The stable and unique string identifying the policy. <p>For more
     * information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]+<br/>
     */
    private String policyId;

    /**
     * The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     * resources. <p>For more information about ARNs, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     * General Reference</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String arn;

    /**
     * The path to the policy. <p>For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>((/[A-Za-z0-9\.,\+@=_-]+)*)/<br/>
     */
    private String path;

    /**
     * The identifier for the version of the policy that is set as the
     * default (operative) version. <p>For more information about policy
     * versions, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning
     * for Managed Policies</a> in the <i>Using IAM</i> guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>v[1-9][0-9]*(\.[A-Za-z0-9-]*)?<br/>
     */
    private String defaultVersionId;

    /**
     * The number of principal entities (users, groups, and roles) that the
     * policy is attached to.
     */
    private Integer attachmentCount;

    /**
     * Specifies whether the policy can be attached to an IAM user, group, or
     * role.
     */
    private Boolean isAttachable;

    /**
     * A friendly description of the policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     */
    private String description;

    /**
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     * 8601 date-time format</a>, when the policy was created.
     */
    private java.util.Date createDate;

    /**
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     * 8601 date-time format</a>, when the policy was last updated. <p>When a
     * policy has only one version, this field contains the date and time
     * when the policy was created. When a policy has more than one version,
     * this field contains the date and time when the most recent policy
     * version was created.
     */
    private java.util.Date updateDate;

    /**
     * A list containing information about the versions of the policy.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PolicyVersion> policyVersionList;

    /**
     * The friendly name (not ARN) identifying the policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return The friendly name (not ARN) identifying the policy.
     */
    public String getPolicyName() {
        return policyName;
    }
    
    /**
     * The friendly name (not ARN) identifying the policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param policyName The friendly name (not ARN) identifying the policy.
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    
    /**
     * The friendly name (not ARN) identifying the policy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param policyName The friendly name (not ARN) identifying the policy.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ManagedPolicyDetail withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * The stable and unique string identifying the policy. <p>For more
     * information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @return The stable and unique string identifying the policy. <p>For more
     *         information about IDs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     *         Identifiers</a> in the <i>Using IAM</i> guide.
     */
    public String getPolicyId() {
        return policyId;
    }
    
    /**
     * The stable and unique string identifying the policy. <p>For more
     * information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param policyId The stable and unique string identifying the policy. <p>For more
     *         information about IDs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     *         Identifiers</a> in the <i>Using IAM</i> guide.
     */
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }
    
    /**
     * The stable and unique string identifying the policy. <p>For more
     * information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param policyId The stable and unique string identifying the policy. <p>For more
     *         information about IDs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     *         Identifiers</a> in the <i>Using IAM</i> guide.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ManagedPolicyDetail withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     * resources. <p>For more information about ARNs, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     * General Reference</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     *         resources. <p>For more information about ARNs, go to <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     *         General Reference</i>.
     */
    public String getArn() {
        return arn;
    }
    
    /**
     * The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     * resources. <p>For more information about ARNs, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     * General Reference</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     *         resources. <p>For more information about ARNs, go to <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     *         General Reference</i>.
     */
    public void setArn(String arn) {
        this.arn = arn;
    }
    
    /**
     * The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     * resources. <p>For more information about ARNs, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     * General Reference</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     *         resources. <p>For more information about ARNs, go to <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS
     *         General Reference</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ManagedPolicyDetail withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * The path to the policy. <p>For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>((/[A-Za-z0-9\.,\+@=_-]+)*)/<br/>
     *
     * @return The path to the policy. <p>For more information about paths, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     *         Identifiers</a> in the <i>Using IAM</i> guide.
     */
    public String getPath() {
        return path;
    }
    
    /**
     * The path to the policy. <p>For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>((/[A-Za-z0-9\.,\+@=_-]+)*)/<br/>
     *
     * @param path The path to the policy. <p>For more information about paths, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     *         Identifiers</a> in the <i>Using IAM</i> guide.
     */
    public void setPath(String path) {
        this.path = path;
    }
    
    /**
     * The path to the policy. <p>For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>((/[A-Za-z0-9\.,\+@=_-]+)*)/<br/>
     *
     * @param path The path to the policy. <p>For more information about paths, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     *         Identifiers</a> in the <i>Using IAM</i> guide.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ManagedPolicyDetail withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * The identifier for the version of the policy that is set as the
     * default (operative) version. <p>For more information about policy
     * versions, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning
     * for Managed Policies</a> in the <i>Using IAM</i> guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>v[1-9][0-9]*(\.[A-Za-z0-9-]*)?<br/>
     *
     * @return The identifier for the version of the policy that is set as the
     *         default (operative) version. <p>For more information about policy
     *         versions, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning
     *         for Managed Policies</a> in the <i>Using IAM</i> guide.
     */
    public String getDefaultVersionId() {
        return defaultVersionId;
    }
    
    /**
     * The identifier for the version of the policy that is set as the
     * default (operative) version. <p>For more information about policy
     * versions, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning
     * for Managed Policies</a> in the <i>Using IAM</i> guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>v[1-9][0-9]*(\.[A-Za-z0-9-]*)?<br/>
     *
     * @param defaultVersionId The identifier for the version of the policy that is set as the
     *         default (operative) version. <p>For more information about policy
     *         versions, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning
     *         for Managed Policies</a> in the <i>Using IAM</i> guide.
     */
    public void setDefaultVersionId(String defaultVersionId) {
        this.defaultVersionId = defaultVersionId;
    }
    
    /**
     * The identifier for the version of the policy that is set as the
     * default (operative) version. <p>For more information about policy
     * versions, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning
     * for Managed Policies</a> in the <i>Using IAM</i> guide.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>v[1-9][0-9]*(\.[A-Za-z0-9-]*)?<br/>
     *
     * @param defaultVersionId The identifier for the version of the policy that is set as the
     *         default (operative) version. <p>For more information about policy
     *         versions, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning
     *         for Managed Policies</a> in the <i>Using IAM</i> guide.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ManagedPolicyDetail withDefaultVersionId(String defaultVersionId) {
        this.defaultVersionId = defaultVersionId;
        return this;
    }

    /**
     * The number of principal entities (users, groups, and roles) that the
     * policy is attached to.
     *
     * @return The number of principal entities (users, groups, and roles) that the
     *         policy is attached to.
     */
    public Integer getAttachmentCount() {
        return attachmentCount;
    }
    
    /**
     * The number of principal entities (users, groups, and roles) that the
     * policy is attached to.
     *
     * @param attachmentCount The number of principal entities (users, groups, and roles) that the
     *         policy is attached to.
     */
    public void setAttachmentCount(Integer attachmentCount) {
        this.attachmentCount = attachmentCount;
    }
    
    /**
     * The number of principal entities (users, groups, and roles) that the
     * policy is attached to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachmentCount The number of principal entities (users, groups, and roles) that the
     *         policy is attached to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ManagedPolicyDetail withAttachmentCount(Integer attachmentCount) {
        this.attachmentCount = attachmentCount;
        return this;
    }

    /**
     * Specifies whether the policy can be attached to an IAM user, group, or
     * role.
     *
     * @return Specifies whether the policy can be attached to an IAM user, group, or
     *         role.
     */
    public Boolean isAttachable() {
        return isAttachable;
    }
    
    /**
     * Specifies whether the policy can be attached to an IAM user, group, or
     * role.
     *
     * @param isAttachable Specifies whether the policy can be attached to an IAM user, group, or
     *         role.
     */
    public void setIsAttachable(Boolean isAttachable) {
        this.isAttachable = isAttachable;
    }
    
    /**
     * Specifies whether the policy can be attached to an IAM user, group, or
     * role.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isAttachable Specifies whether the policy can be attached to an IAM user, group, or
     *         role.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ManagedPolicyDetail withIsAttachable(Boolean isAttachable) {
        this.isAttachable = isAttachable;
        return this;
    }

    /**
     * Specifies whether the policy can be attached to an IAM user, group, or
     * role.
     *
     * @return Specifies whether the policy can be attached to an IAM user, group, or
     *         role.
     */
    public Boolean getIsAttachable() {
        return isAttachable;
    }

    /**
     * A friendly description of the policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @return A friendly description of the policy.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A friendly description of the policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param description A friendly description of the policy.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A friendly description of the policy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param description A friendly description of the policy.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ManagedPolicyDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     * 8601 date-time format</a>, when the policy was created.
     *
     * @return The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     *         8601 date-time format</a>, when the policy was created.
     */
    public java.util.Date getCreateDate() {
        return createDate;
    }
    
    /**
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     * 8601 date-time format</a>, when the policy was created.
     *
     * @param createDate The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     *         8601 date-time format</a>, when the policy was created.
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }
    
    /**
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     * 8601 date-time format</a>, when the policy was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createDate The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     *         8601 date-time format</a>, when the policy was created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ManagedPolicyDetail withCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     * 8601 date-time format</a>, when the policy was last updated. <p>When a
     * policy has only one version, this field contains the date and time
     * when the policy was created. When a policy has more than one version,
     * this field contains the date and time when the most recent policy
     * version was created.
     *
     * @return The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     *         8601 date-time format</a>, when the policy was last updated. <p>When a
     *         policy has only one version, this field contains the date and time
     *         when the policy was created. When a policy has more than one version,
     *         this field contains the date and time when the most recent policy
     *         version was created.
     */
    public java.util.Date getUpdateDate() {
        return updateDate;
    }
    
    /**
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     * 8601 date-time format</a>, when the policy was last updated. <p>When a
     * policy has only one version, this field contains the date and time
     * when the policy was created. When a policy has more than one version,
     * this field contains the date and time when the most recent policy
     * version was created.
     *
     * @param updateDate The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     *         8601 date-time format</a>, when the policy was last updated. <p>When a
     *         policy has only one version, this field contains the date and time
     *         when the policy was created. When a policy has more than one version,
     *         this field contains the date and time when the most recent policy
     *         version was created.
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }
    
    /**
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     * 8601 date-time format</a>, when the policy was last updated. <p>When a
     * policy has only one version, this field contains the date and time
     * when the policy was created. When a policy has more than one version,
     * this field contains the date and time when the most recent policy
     * version was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param updateDate The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     *         8601 date-time format</a>, when the policy was last updated. <p>When a
     *         policy has only one version, this field contains the date and time
     *         when the policy was created. When a policy has more than one version,
     *         this field contains the date and time when the most recent policy
     *         version was created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ManagedPolicyDetail withUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
        return this;
    }

    /**
     * A list containing information about the versions of the policy.
     *
     * @return A list containing information about the versions of the policy.
     */
    public java.util.List<PolicyVersion> getPolicyVersionList() {
        if (policyVersionList == null) {
              policyVersionList = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyVersion>();
              policyVersionList.setAutoConstruct(true);
        }
        return policyVersionList;
    }
    
    /**
     * A list containing information about the versions of the policy.
     *
     * @param policyVersionList A list containing information about the versions of the policy.
     */
    public void setPolicyVersionList(java.util.Collection<PolicyVersion> policyVersionList) {
        if (policyVersionList == null) {
            this.policyVersionList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<PolicyVersion> policyVersionListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyVersion>(policyVersionList.size());
        policyVersionListCopy.addAll(policyVersionList);
        this.policyVersionList = policyVersionListCopy;
    }
    
    /**
     * A list containing information about the versions of the policy.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPolicyVersionList(java.util.Collection)} or
     * {@link #withPolicyVersionList(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyVersionList A list containing information about the versions of the policy.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ManagedPolicyDetail withPolicyVersionList(PolicyVersion... policyVersionList) {
        if (getPolicyVersionList() == null) setPolicyVersionList(new java.util.ArrayList<PolicyVersion>(policyVersionList.length));
        for (PolicyVersion value : policyVersionList) {
            getPolicyVersionList().add(value);
        }
        return this;
    }
    
    /**
     * A list containing information about the versions of the policy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyVersionList A list containing information about the versions of the policy.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ManagedPolicyDetail withPolicyVersionList(java.util.Collection<PolicyVersion> policyVersionList) {
        if (policyVersionList == null) {
            this.policyVersionList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<PolicyVersion> policyVersionListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyVersion>(policyVersionList.size());
            policyVersionListCopy.addAll(policyVersionList);
            this.policyVersionList = policyVersionListCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPolicyName() != null) sb.append("PolicyName: " + getPolicyName() + ",");
        if (getPolicyId() != null) sb.append("PolicyId: " + getPolicyId() + ",");
        if (getArn() != null) sb.append("Arn: " + getArn() + ",");
        if (getPath() != null) sb.append("Path: " + getPath() + ",");
        if (getDefaultVersionId() != null) sb.append("DefaultVersionId: " + getDefaultVersionId() + ",");
        if (getAttachmentCount() != null) sb.append("AttachmentCount: " + getAttachmentCount() + ",");
        if (isAttachable() != null) sb.append("IsAttachable: " + isAttachable() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getCreateDate() != null) sb.append("CreateDate: " + getCreateDate() + ",");
        if (getUpdateDate() != null) sb.append("UpdateDate: " + getUpdateDate() + ",");
        if (getPolicyVersionList() != null) sb.append("PolicyVersionList: " + getPolicyVersionList() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode()); 
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode()); 
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode()); 
        hashCode = prime * hashCode + ((getDefaultVersionId() == null) ? 0 : getDefaultVersionId().hashCode()); 
        hashCode = prime * hashCode + ((getAttachmentCount() == null) ? 0 : getAttachmentCount().hashCode()); 
        hashCode = prime * hashCode + ((isAttachable() == null) ? 0 : isAttachable().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode()); 
        hashCode = prime * hashCode + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyVersionList() == null) ? 0 : getPolicyVersionList().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ManagedPolicyDetail == false) return false;
        ManagedPolicyDetail other = (ManagedPolicyDetail)obj;
        
        if (other.getPolicyName() == null ^ this.getPolicyName() == null) return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false) return false; 
        if (other.getPolicyId() == null ^ this.getPolicyId() == null) return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false) return false; 
        if (other.getArn() == null ^ this.getArn() == null) return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false) return false; 
        if (other.getPath() == null ^ this.getPath() == null) return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false) return false; 
        if (other.getDefaultVersionId() == null ^ this.getDefaultVersionId() == null) return false;
        if (other.getDefaultVersionId() != null && other.getDefaultVersionId().equals(this.getDefaultVersionId()) == false) return false; 
        if (other.getAttachmentCount() == null ^ this.getAttachmentCount() == null) return false;
        if (other.getAttachmentCount() != null && other.getAttachmentCount().equals(this.getAttachmentCount()) == false) return false; 
        if (other.isAttachable() == null ^ this.isAttachable() == null) return false;
        if (other.isAttachable() != null && other.isAttachable().equals(this.isAttachable()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getCreateDate() == null ^ this.getCreateDate() == null) return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false) return false; 
        if (other.getUpdateDate() == null ^ this.getUpdateDate() == null) return false;
        if (other.getUpdateDate() != null && other.getUpdateDate().equals(this.getUpdateDate()) == false) return false; 
        if (other.getPolicyVersionList() == null ^ this.getPolicyVersionList() == null) return false;
        if (other.getPolicyVersionList() != null && other.getPolicyVersionList().equals(this.getPolicyVersionList()) == false) return false; 
        return true;
    }
    
    @Override
    public ManagedPolicyDetail clone() {
        try {
            return (ManagedPolicyDetail) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    