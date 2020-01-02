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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdatePullRequestApprovalRuleContent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePullRequestApprovalRuleContentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The system-generated ID of the pull request.
     * </p>
     */
    private String pullRequestId;
    /**
     * <p>
     * The name of the approval rule you want to update.
     * </p>
     */
    private String approvalRuleName;
    /**
     * <p>
     * The SHA-256 hash signature for the content of the approval rule. You can retrieve this information by using
     * <a>GetPullRequest</a>.
     * </p>
     */
    private String existingRuleContentSha256;
    /**
     * <p>
     * The updated content for the approval rule.
     * </p>
     * <note>
     * <p>
     * When you update the content of the approval rule, you can specify approvers in an approval pool in one of two
     * ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>CodeCommitApprovers</b>: This option only requires an AWS account and a resource. It can be used for both IAM
     * users and federated access users whose name matches the provided resource name. This is a very powerful option
     * that offers a great deal of flexibility. For example, if you specify the AWS account <i>123456789012</i> and
     * <i>Mary_Major</i>, all of the following are counted as approvals coming from that user:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An IAM user in the account (arn:aws:iam::<i>123456789012</i>:user/<i>Mary_Major</i>)
     * </p>
     * </li>
     * <li>
     * <p>
     * A federated user identified in IAM as Mary_Major
     * (arn:aws:sts::<i>123456789012</i>:federated-user/<i>Mary_Major</i>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * This option does not recognize an active session of someone assuming the role of CodeCommitReview with a role
     * session name of <i>Mary_Major</i>
     * (arn:aws:sts::<i>123456789012</i>:assumed-role/CodeCommitReview/<i>Mary_Major</i>) unless you include a wildcard
     * (*Mary_Major).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Fully qualified ARN</b>: This option allows you to specify the fully qualified Amazon Resource Name (ARN) of
     * the IAM user or role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about IAM ARNs, wildcards, and formats, see <a
     * href="https://docs.aws.amazon.com/iam/latest/UserGuide/reference_identifiers.html">IAM Identifiers</a> in the
     * <i>IAM User Guide</i>.
     * </p>
     * </note>
     */
    private String newRuleContent;

    /**
     * <p>
     * The system-generated ID of the pull request.
     * </p>
     * 
     * @param pullRequestId
     *        The system-generated ID of the pull request.
     */

    public void setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request.
     * </p>
     * 
     * @return The system-generated ID of the pull request.
     */

    public String getPullRequestId() {
        return this.pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request.
     * </p>
     * 
     * @param pullRequestId
     *        The system-generated ID of the pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePullRequestApprovalRuleContentRequest withPullRequestId(String pullRequestId) {
        setPullRequestId(pullRequestId);
        return this;
    }

    /**
     * <p>
     * The name of the approval rule you want to update.
     * </p>
     * 
     * @param approvalRuleName
     *        The name of the approval rule you want to update.
     */

    public void setApprovalRuleName(String approvalRuleName) {
        this.approvalRuleName = approvalRuleName;
    }

    /**
     * <p>
     * The name of the approval rule you want to update.
     * </p>
     * 
     * @return The name of the approval rule you want to update.
     */

    public String getApprovalRuleName() {
        return this.approvalRuleName;
    }

    /**
     * <p>
     * The name of the approval rule you want to update.
     * </p>
     * 
     * @param approvalRuleName
     *        The name of the approval rule you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePullRequestApprovalRuleContentRequest withApprovalRuleName(String approvalRuleName) {
        setApprovalRuleName(approvalRuleName);
        return this;
    }

    /**
     * <p>
     * The SHA-256 hash signature for the content of the approval rule. You can retrieve this information by using
     * <a>GetPullRequest</a>.
     * </p>
     * 
     * @param existingRuleContentSha256
     *        The SHA-256 hash signature for the content of the approval rule. You can retrieve this information by
     *        using <a>GetPullRequest</a>.
     */

    public void setExistingRuleContentSha256(String existingRuleContentSha256) {
        this.existingRuleContentSha256 = existingRuleContentSha256;
    }

    /**
     * <p>
     * The SHA-256 hash signature for the content of the approval rule. You can retrieve this information by using
     * <a>GetPullRequest</a>.
     * </p>
     * 
     * @return The SHA-256 hash signature for the content of the approval rule. You can retrieve this information by
     *         using <a>GetPullRequest</a>.
     */

    public String getExistingRuleContentSha256() {
        return this.existingRuleContentSha256;
    }

    /**
     * <p>
     * The SHA-256 hash signature for the content of the approval rule. You can retrieve this information by using
     * <a>GetPullRequest</a>.
     * </p>
     * 
     * @param existingRuleContentSha256
     *        The SHA-256 hash signature for the content of the approval rule. You can retrieve this information by
     *        using <a>GetPullRequest</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePullRequestApprovalRuleContentRequest withExistingRuleContentSha256(String existingRuleContentSha256) {
        setExistingRuleContentSha256(existingRuleContentSha256);
        return this;
    }

    /**
     * <p>
     * The updated content for the approval rule.
     * </p>
     * <note>
     * <p>
     * When you update the content of the approval rule, you can specify approvers in an approval pool in one of two
     * ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>CodeCommitApprovers</b>: This option only requires an AWS account and a resource. It can be used for both IAM
     * users and federated access users whose name matches the provided resource name. This is a very powerful option
     * that offers a great deal of flexibility. For example, if you specify the AWS account <i>123456789012</i> and
     * <i>Mary_Major</i>, all of the following are counted as approvals coming from that user:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An IAM user in the account (arn:aws:iam::<i>123456789012</i>:user/<i>Mary_Major</i>)
     * </p>
     * </li>
     * <li>
     * <p>
     * A federated user identified in IAM as Mary_Major
     * (arn:aws:sts::<i>123456789012</i>:federated-user/<i>Mary_Major</i>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * This option does not recognize an active session of someone assuming the role of CodeCommitReview with a role
     * session name of <i>Mary_Major</i>
     * (arn:aws:sts::<i>123456789012</i>:assumed-role/CodeCommitReview/<i>Mary_Major</i>) unless you include a wildcard
     * (*Mary_Major).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Fully qualified ARN</b>: This option allows you to specify the fully qualified Amazon Resource Name (ARN) of
     * the IAM user or role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about IAM ARNs, wildcards, and formats, see <a
     * href="https://docs.aws.amazon.com/iam/latest/UserGuide/reference_identifiers.html">IAM Identifiers</a> in the
     * <i>IAM User Guide</i>.
     * </p>
     * </note>
     * 
     * @param newRuleContent
     *        The updated content for the approval rule.</p> <note>
     *        <p>
     *        When you update the content of the approval rule, you can specify approvers in an approval pool in one of
     *        two ways:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>CodeCommitApprovers</b>: This option only requires an AWS account and a resource. It can be used for
     *        both IAM users and federated access users whose name matches the provided resource name. This is a very
     *        powerful option that offers a great deal of flexibility. For example, if you specify the AWS account
     *        <i>123456789012</i> and <i>Mary_Major</i>, all of the following are counted as approvals coming from that
     *        user:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        An IAM user in the account (arn:aws:iam::<i>123456789012</i>:user/<i>Mary_Major</i>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A federated user identified in IAM as Mary_Major
     *        (arn:aws:sts::<i>123456789012</i>:federated-user/<i>Mary_Major</i>)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This option does not recognize an active session of someone assuming the role of CodeCommitReview with a
     *        role session name of <i>Mary_Major</i>
     *        (arn:aws:sts::<i>123456789012</i>:assumed-role/CodeCommitReview/<i>Mary_Major</i>) unless you include a
     *        wildcard (*Mary_Major).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Fully qualified ARN</b>: This option allows you to specify the fully qualified Amazon Resource Name
     *        (ARN) of the IAM user or role.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about IAM ARNs, wildcards, and formats, see <a
     *        href="https://docs.aws.amazon.com/iam/latest/UserGuide/reference_identifiers.html">IAM Identifiers</a> in
     *        the <i>IAM User Guide</i>.
     *        </p>
     */

    public void setNewRuleContent(String newRuleContent) {
        this.newRuleContent = newRuleContent;
    }

    /**
     * <p>
     * The updated content for the approval rule.
     * </p>
     * <note>
     * <p>
     * When you update the content of the approval rule, you can specify approvers in an approval pool in one of two
     * ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>CodeCommitApprovers</b>: This option only requires an AWS account and a resource. It can be used for both IAM
     * users and federated access users whose name matches the provided resource name. This is a very powerful option
     * that offers a great deal of flexibility. For example, if you specify the AWS account <i>123456789012</i> and
     * <i>Mary_Major</i>, all of the following are counted as approvals coming from that user:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An IAM user in the account (arn:aws:iam::<i>123456789012</i>:user/<i>Mary_Major</i>)
     * </p>
     * </li>
     * <li>
     * <p>
     * A federated user identified in IAM as Mary_Major
     * (arn:aws:sts::<i>123456789012</i>:federated-user/<i>Mary_Major</i>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * This option does not recognize an active session of someone assuming the role of CodeCommitReview with a role
     * session name of <i>Mary_Major</i>
     * (arn:aws:sts::<i>123456789012</i>:assumed-role/CodeCommitReview/<i>Mary_Major</i>) unless you include a wildcard
     * (*Mary_Major).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Fully qualified ARN</b>: This option allows you to specify the fully qualified Amazon Resource Name (ARN) of
     * the IAM user or role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about IAM ARNs, wildcards, and formats, see <a
     * href="https://docs.aws.amazon.com/iam/latest/UserGuide/reference_identifiers.html">IAM Identifiers</a> in the
     * <i>IAM User Guide</i>.
     * </p>
     * </note>
     * 
     * @return The updated content for the approval rule.</p> <note>
     *         <p>
     *         When you update the content of the approval rule, you can specify approvers in an approval pool in one of
     *         two ways:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>CodeCommitApprovers</b>: This option only requires an AWS account and a resource. It can be used for
     *         both IAM users and federated access users whose name matches the provided resource name. This is a very
     *         powerful option that offers a great deal of flexibility. For example, if you specify the AWS account
     *         <i>123456789012</i> and <i>Mary_Major</i>, all of the following are counted as approvals coming from that
     *         user:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         An IAM user in the account (arn:aws:iam::<i>123456789012</i>:user/<i>Mary_Major</i>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A federated user identified in IAM as Mary_Major
     *         (arn:aws:sts::<i>123456789012</i>:federated-user/<i>Mary_Major</i>)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         This option does not recognize an active session of someone assuming the role of CodeCommitReview with a
     *         role session name of <i>Mary_Major</i>
     *         (arn:aws:sts::<i>123456789012</i>:assumed-role/CodeCommitReview/<i>Mary_Major</i>) unless you include a
     *         wildcard (*Mary_Major).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Fully qualified ARN</b>: This option allows you to specify the fully qualified Amazon Resource Name
     *         (ARN) of the IAM user or role.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about IAM ARNs, wildcards, and formats, see <a
     *         href="https://docs.aws.amazon.com/iam/latest/UserGuide/reference_identifiers.html">IAM Identifiers</a> in
     *         the <i>IAM User Guide</i>.
     *         </p>
     */

    public String getNewRuleContent() {
        return this.newRuleContent;
    }

    /**
     * <p>
     * The updated content for the approval rule.
     * </p>
     * <note>
     * <p>
     * When you update the content of the approval rule, you can specify approvers in an approval pool in one of two
     * ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>CodeCommitApprovers</b>: This option only requires an AWS account and a resource. It can be used for both IAM
     * users and federated access users whose name matches the provided resource name. This is a very powerful option
     * that offers a great deal of flexibility. For example, if you specify the AWS account <i>123456789012</i> and
     * <i>Mary_Major</i>, all of the following are counted as approvals coming from that user:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An IAM user in the account (arn:aws:iam::<i>123456789012</i>:user/<i>Mary_Major</i>)
     * </p>
     * </li>
     * <li>
     * <p>
     * A federated user identified in IAM as Mary_Major
     * (arn:aws:sts::<i>123456789012</i>:federated-user/<i>Mary_Major</i>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * This option does not recognize an active session of someone assuming the role of CodeCommitReview with a role
     * session name of <i>Mary_Major</i>
     * (arn:aws:sts::<i>123456789012</i>:assumed-role/CodeCommitReview/<i>Mary_Major</i>) unless you include a wildcard
     * (*Mary_Major).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Fully qualified ARN</b>: This option allows you to specify the fully qualified Amazon Resource Name (ARN) of
     * the IAM user or role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about IAM ARNs, wildcards, and formats, see <a
     * href="https://docs.aws.amazon.com/iam/latest/UserGuide/reference_identifiers.html">IAM Identifiers</a> in the
     * <i>IAM User Guide</i>.
     * </p>
     * </note>
     * 
     * @param newRuleContent
     *        The updated content for the approval rule.</p> <note>
     *        <p>
     *        When you update the content of the approval rule, you can specify approvers in an approval pool in one of
     *        two ways:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>CodeCommitApprovers</b>: This option only requires an AWS account and a resource. It can be used for
     *        both IAM users and federated access users whose name matches the provided resource name. This is a very
     *        powerful option that offers a great deal of flexibility. For example, if you specify the AWS account
     *        <i>123456789012</i> and <i>Mary_Major</i>, all of the following are counted as approvals coming from that
     *        user:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        An IAM user in the account (arn:aws:iam::<i>123456789012</i>:user/<i>Mary_Major</i>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A federated user identified in IAM as Mary_Major
     *        (arn:aws:sts::<i>123456789012</i>:federated-user/<i>Mary_Major</i>)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This option does not recognize an active session of someone assuming the role of CodeCommitReview with a
     *        role session name of <i>Mary_Major</i>
     *        (arn:aws:sts::<i>123456789012</i>:assumed-role/CodeCommitReview/<i>Mary_Major</i>) unless you include a
     *        wildcard (*Mary_Major).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Fully qualified ARN</b>: This option allows you to specify the fully qualified Amazon Resource Name
     *        (ARN) of the IAM user or role.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about IAM ARNs, wildcards, and formats, see <a
     *        href="https://docs.aws.amazon.com/iam/latest/UserGuide/reference_identifiers.html">IAM Identifiers</a> in
     *        the <i>IAM User Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePullRequestApprovalRuleContentRequest withNewRuleContent(String newRuleContent) {
        setNewRuleContent(newRuleContent);
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
        if (getPullRequestId() != null)
            sb.append("PullRequestId: ").append(getPullRequestId()).append(",");
        if (getApprovalRuleName() != null)
            sb.append("ApprovalRuleName: ").append(getApprovalRuleName()).append(",");
        if (getExistingRuleContentSha256() != null)
            sb.append("ExistingRuleContentSha256: ").append(getExistingRuleContentSha256()).append(",");
        if (getNewRuleContent() != null)
            sb.append("NewRuleContent: ").append(getNewRuleContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePullRequestApprovalRuleContentRequest == false)
            return false;
        UpdatePullRequestApprovalRuleContentRequest other = (UpdatePullRequestApprovalRuleContentRequest) obj;
        if (other.getPullRequestId() == null ^ this.getPullRequestId() == null)
            return false;
        if (other.getPullRequestId() != null && other.getPullRequestId().equals(this.getPullRequestId()) == false)
            return false;
        if (other.getApprovalRuleName() == null ^ this.getApprovalRuleName() == null)
            return false;
        if (other.getApprovalRuleName() != null && other.getApprovalRuleName().equals(this.getApprovalRuleName()) == false)
            return false;
        if (other.getExistingRuleContentSha256() == null ^ this.getExistingRuleContentSha256() == null)
            return false;
        if (other.getExistingRuleContentSha256() != null && other.getExistingRuleContentSha256().equals(this.getExistingRuleContentSha256()) == false)
            return false;
        if (other.getNewRuleContent() == null ^ this.getNewRuleContent() == null)
            return false;
        if (other.getNewRuleContent() != null && other.getNewRuleContent().equals(this.getNewRuleContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPullRequestId() == null) ? 0 : getPullRequestId().hashCode());
        hashCode = prime * hashCode + ((getApprovalRuleName() == null) ? 0 : getApprovalRuleName().hashCode());
        hashCode = prime * hashCode + ((getExistingRuleContentSha256() == null) ? 0 : getExistingRuleContentSha256().hashCode());
        hashCode = prime * hashCode + ((getNewRuleContent() == null) ? 0 : getNewRuleContent().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePullRequestApprovalRuleContentRequest clone() {
        return (UpdatePullRequestApprovalRuleContentRequest) super.clone();
    }

}
