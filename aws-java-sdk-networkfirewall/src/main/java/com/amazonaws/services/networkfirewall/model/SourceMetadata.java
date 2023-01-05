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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * High-level information about the managed rule group that your own rule group is copied from. You can use the the
 * metadata to track version updates made to the originating rule group. You can retrieve all objects for a rule group
 * by calling <a href="https://docs.aws.amazon.com/network-firewall/latest/APIReference/API_DescribeRuleGroup.html">
 * DescribeRuleGroup</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/SourceMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule group that your own rule group is copied from.
     * </p>
     */
    private String sourceArn;
    /**
     * <p>
     * The update token of the Amazon Web Services managed rule group that your own rule group is copied from. To
     * determine the update token for the managed rule group, call <a href=
     * "https://docs.aws.amazon.com/network-firewall/latest/APIReference/API_DescribeRuleGroup.html#networkfirewall-DescribeRuleGroup-response-UpdateToken"
     * >DescribeRuleGroup</a>.
     * </p>
     */
    private String sourceUpdateToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule group that your own rule group is copied from.
     * </p>
     * 
     * @param sourceArn
     *        The Amazon Resource Name (ARN) of the rule group that your own rule group is copied from.
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule group that your own rule group is copied from.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the rule group that your own rule group is copied from.
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule group that your own rule group is copied from.
     * </p>
     * 
     * @param sourceArn
     *        The Amazon Resource Name (ARN) of the rule group that your own rule group is copied from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceMetadata withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * <p>
     * The update token of the Amazon Web Services managed rule group that your own rule group is copied from. To
     * determine the update token for the managed rule group, call <a href=
     * "https://docs.aws.amazon.com/network-firewall/latest/APIReference/API_DescribeRuleGroup.html#networkfirewall-DescribeRuleGroup-response-UpdateToken"
     * >DescribeRuleGroup</a>.
     * </p>
     * 
     * @param sourceUpdateToken
     *        The update token of the Amazon Web Services managed rule group that your own rule group is copied from. To
     *        determine the update token for the managed rule group, call <a href=
     *        "https://docs.aws.amazon.com/network-firewall/latest/APIReference/API_DescribeRuleGroup.html#networkfirewall-DescribeRuleGroup-response-UpdateToken"
     *        >DescribeRuleGroup</a>.
     */

    public void setSourceUpdateToken(String sourceUpdateToken) {
        this.sourceUpdateToken = sourceUpdateToken;
    }

    /**
     * <p>
     * The update token of the Amazon Web Services managed rule group that your own rule group is copied from. To
     * determine the update token for the managed rule group, call <a href=
     * "https://docs.aws.amazon.com/network-firewall/latest/APIReference/API_DescribeRuleGroup.html#networkfirewall-DescribeRuleGroup-response-UpdateToken"
     * >DescribeRuleGroup</a>.
     * </p>
     * 
     * @return The update token of the Amazon Web Services managed rule group that your own rule group is copied from.
     *         To determine the update token for the managed rule group, call <a href=
     *         "https://docs.aws.amazon.com/network-firewall/latest/APIReference/API_DescribeRuleGroup.html#networkfirewall-DescribeRuleGroup-response-UpdateToken"
     *         >DescribeRuleGroup</a>.
     */

    public String getSourceUpdateToken() {
        return this.sourceUpdateToken;
    }

    /**
     * <p>
     * The update token of the Amazon Web Services managed rule group that your own rule group is copied from. To
     * determine the update token for the managed rule group, call <a href=
     * "https://docs.aws.amazon.com/network-firewall/latest/APIReference/API_DescribeRuleGroup.html#networkfirewall-DescribeRuleGroup-response-UpdateToken"
     * >DescribeRuleGroup</a>.
     * </p>
     * 
     * @param sourceUpdateToken
     *        The update token of the Amazon Web Services managed rule group that your own rule group is copied from. To
     *        determine the update token for the managed rule group, call <a href=
     *        "https://docs.aws.amazon.com/network-firewall/latest/APIReference/API_DescribeRuleGroup.html#networkfirewall-DescribeRuleGroup-response-UpdateToken"
     *        >DescribeRuleGroup</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceMetadata withSourceUpdateToken(String sourceUpdateToken) {
        setSourceUpdateToken(sourceUpdateToken);
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
        if (getSourceArn() != null)
            sb.append("SourceArn: ").append(getSourceArn()).append(",");
        if (getSourceUpdateToken() != null)
            sb.append("SourceUpdateToken: ").append(getSourceUpdateToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceMetadata == false)
            return false;
        SourceMetadata other = (SourceMetadata) obj;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getSourceUpdateToken() == null ^ this.getSourceUpdateToken() == null)
            return false;
        if (other.getSourceUpdateToken() != null && other.getSourceUpdateToken().equals(this.getSourceUpdateToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getSourceUpdateToken() == null) ? 0 : getSourceUpdateToken().hashCode());
        return hashCode;
    }

    @Override
    public SourceMetadata clone() {
        try {
            return (SourceMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.SourceMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
