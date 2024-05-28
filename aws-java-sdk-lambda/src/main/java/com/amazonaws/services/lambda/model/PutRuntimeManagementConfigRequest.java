/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PutRuntimeManagementConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutRuntimeManagementConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or ARN of the Lambda function.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> – <code>my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> – <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> – <code>123456789012:function:my-function</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64
     * characters in length.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * Specify a version of the function. This can be <code>$LATEST</code> or a published version number. If no value is
     * specified, the configuration for the <code>$LATEST</code> version is returned.
     * </p>
     */
    private String qualifier;
    /**
     * <p>
     * Specify the runtime update mode.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Auto (default)</b> - Automatically update to the most recent and secure runtime version using a <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-two-phase">Two-phase
     * runtime version rollout</a>. This is the best choice for most customers to ensure they always benefit from
     * runtime updates.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function update</b> - Lambda updates the runtime of your function to the most recent and secure runtime
     * version when you update your function. This approach synchronizes runtime updates with function deployments,
     * giving you control over when runtime updates are applied and allowing you to detect and mitigate rare runtime
     * update incompatibilities early. When using this setting, you need to regularly update your functions to keep
     * their runtime up-to-date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Manual</b> - You specify a runtime version in your function configuration. The function will use this runtime
     * version indefinitely. In the rare case where a new runtime version is incompatible with an existing function,
     * this allows you to roll back your function to an earlier runtime version. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-rollback">Roll back a
     * runtime version</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String updateRuntimeOn;
    /**
     * <p>
     * The ARN of the runtime version you want the function to use.
     * </p>
     * <note>
     * <p>
     * This is only required if you're using the <b>Manual</b> runtime update mode.
     * </p>
     * </note>
     */
    private String runtimeVersionArn;

    /**
     * <p>
     * The name or ARN of the Lambda function.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> – <code>my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> – <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> – <code>123456789012:function:my-function</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64
     * characters in length.
     * </p>
     * 
     * @param functionName
     *        The name or ARN of the Lambda function.</p>
     *        <p class="title">
     *        <b>Name formats</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Function name</b> – <code>my-function</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Function ARN</b> – <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Partial ARN</b> – <code>123456789012:function:my-function</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The length constraint applies only to the full ARN. If you specify only the function name, it is limited
     *        to 64 characters in length.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The name or ARN of the Lambda function.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> – <code>my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> – <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> – <code>123456789012:function:my-function</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64
     * characters in length.
     * </p>
     * 
     * @return The name or ARN of the Lambda function.</p>
     *         <p class="title">
     *         <b>Name formats</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Function name</b> – <code>my-function</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Function ARN</b> – <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Partial ARN</b> – <code>123456789012:function:my-function</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The length constraint applies only to the full ARN. If you specify only the function name, it is limited
     *         to 64 characters in length.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The name or ARN of the Lambda function.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> – <code>my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> – <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> – <code>123456789012:function:my-function</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64
     * characters in length.
     * </p>
     * 
     * @param functionName
     *        The name or ARN of the Lambda function.</p>
     *        <p class="title">
     *        <b>Name formats</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Function name</b> – <code>my-function</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Function ARN</b> – <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Partial ARN</b> – <code>123456789012:function:my-function</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The length constraint applies only to the full ARN. If you specify only the function name, it is limited
     *        to 64 characters in length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRuntimeManagementConfigRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * Specify a version of the function. This can be <code>$LATEST</code> or a published version number. If no value is
     * specified, the configuration for the <code>$LATEST</code> version is returned.
     * </p>
     * 
     * @param qualifier
     *        Specify a version of the function. This can be <code>$LATEST</code> or a published version number. If no
     *        value is specified, the configuration for the <code>$LATEST</code> version is returned.
     */

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    /**
     * <p>
     * Specify a version of the function. This can be <code>$LATEST</code> or a published version number. If no value is
     * specified, the configuration for the <code>$LATEST</code> version is returned.
     * </p>
     * 
     * @return Specify a version of the function. This can be <code>$LATEST</code> or a published version number. If no
     *         value is specified, the configuration for the <code>$LATEST</code> version is returned.
     */

    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * <p>
     * Specify a version of the function. This can be <code>$LATEST</code> or a published version number. If no value is
     * specified, the configuration for the <code>$LATEST</code> version is returned.
     * </p>
     * 
     * @param qualifier
     *        Specify a version of the function. This can be <code>$LATEST</code> or a published version number. If no
     *        value is specified, the configuration for the <code>$LATEST</code> version is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRuntimeManagementConfigRequest withQualifier(String qualifier) {
        setQualifier(qualifier);
        return this;
    }

    /**
     * <p>
     * Specify the runtime update mode.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Auto (default)</b> - Automatically update to the most recent and secure runtime version using a <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-two-phase">Two-phase
     * runtime version rollout</a>. This is the best choice for most customers to ensure they always benefit from
     * runtime updates.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function update</b> - Lambda updates the runtime of your function to the most recent and secure runtime
     * version when you update your function. This approach synchronizes runtime updates with function deployments,
     * giving you control over when runtime updates are applied and allowing you to detect and mitigate rare runtime
     * update incompatibilities early. When using this setting, you need to regularly update your functions to keep
     * their runtime up-to-date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Manual</b> - You specify a runtime version in your function configuration. The function will use this runtime
     * version indefinitely. In the rare case where a new runtime version is incompatible with an existing function,
     * this allows you to roll back your function to an earlier runtime version. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-rollback">Roll back a
     * runtime version</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateRuntimeOn
     *        Specify the runtime update mode.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Auto (default)</b> - Automatically update to the most recent and secure runtime version using a <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-two-phase">Two-
     *        phase runtime version rollout</a>. This is the best choice for most customers to ensure they always
     *        benefit from runtime updates.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Function update</b> - Lambda updates the runtime of your function to the most recent and secure runtime
     *        version when you update your function. This approach synchronizes runtime updates with function
     *        deployments, giving you control over when runtime updates are applied and allowing you to detect and
     *        mitigate rare runtime update incompatibilities early. When using this setting, you need to regularly
     *        update your functions to keep their runtime up-to-date.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Manual</b> - You specify a runtime version in your function configuration. The function will use this
     *        runtime version indefinitely. In the rare case where a new runtime version is incompatible with an
     *        existing function, this allows you to roll back your function to an earlier runtime version. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-rollback">Roll
     *        back a runtime version</a>.
     *        </p>
     *        </li>
     * @see UpdateRuntimeOn
     */

    public void setUpdateRuntimeOn(String updateRuntimeOn) {
        this.updateRuntimeOn = updateRuntimeOn;
    }

    /**
     * <p>
     * Specify the runtime update mode.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Auto (default)</b> - Automatically update to the most recent and secure runtime version using a <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-two-phase">Two-phase
     * runtime version rollout</a>. This is the best choice for most customers to ensure they always benefit from
     * runtime updates.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function update</b> - Lambda updates the runtime of your function to the most recent and secure runtime
     * version when you update your function. This approach synchronizes runtime updates with function deployments,
     * giving you control over when runtime updates are applied and allowing you to detect and mitigate rare runtime
     * update incompatibilities early. When using this setting, you need to regularly update your functions to keep
     * their runtime up-to-date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Manual</b> - You specify a runtime version in your function configuration. The function will use this runtime
     * version indefinitely. In the rare case where a new runtime version is incompatible with an existing function,
     * this allows you to roll back your function to an earlier runtime version. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-rollback">Roll back a
     * runtime version</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specify the runtime update mode.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Auto (default)</b> - Automatically update to the most recent and secure runtime version using a <a
     *         href
     *         ="https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-two-phase">Two-
     *         phase runtime version rollout</a>. This is the best choice for most customers to ensure they always
     *         benefit from runtime updates.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Function update</b> - Lambda updates the runtime of your function to the most recent and secure
     *         runtime version when you update your function. This approach synchronizes runtime updates with function
     *         deployments, giving you control over when runtime updates are applied and allowing you to detect and
     *         mitigate rare runtime update incompatibilities early. When using this setting, you need to regularly
     *         update your functions to keep their runtime up-to-date.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Manual</b> - You specify a runtime version in your function configuration. The function will use this
     *         runtime version indefinitely. In the rare case where a new runtime version is incompatible with an
     *         existing function, this allows you to roll back your function to an earlier runtime version. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-rollback">Roll
     *         back a runtime version</a>.
     *         </p>
     *         </li>
     * @see UpdateRuntimeOn
     */

    public String getUpdateRuntimeOn() {
        return this.updateRuntimeOn;
    }

    /**
     * <p>
     * Specify the runtime update mode.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Auto (default)</b> - Automatically update to the most recent and secure runtime version using a <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-two-phase">Two-phase
     * runtime version rollout</a>. This is the best choice for most customers to ensure they always benefit from
     * runtime updates.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function update</b> - Lambda updates the runtime of your function to the most recent and secure runtime
     * version when you update your function. This approach synchronizes runtime updates with function deployments,
     * giving you control over when runtime updates are applied and allowing you to detect and mitigate rare runtime
     * update incompatibilities early. When using this setting, you need to regularly update your functions to keep
     * their runtime up-to-date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Manual</b> - You specify a runtime version in your function configuration. The function will use this runtime
     * version indefinitely. In the rare case where a new runtime version is incompatible with an existing function,
     * this allows you to roll back your function to an earlier runtime version. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-rollback">Roll back a
     * runtime version</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateRuntimeOn
     *        Specify the runtime update mode.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Auto (default)</b> - Automatically update to the most recent and secure runtime version using a <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-two-phase">Two-
     *        phase runtime version rollout</a>. This is the best choice for most customers to ensure they always
     *        benefit from runtime updates.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Function update</b> - Lambda updates the runtime of your function to the most recent and secure runtime
     *        version when you update your function. This approach synchronizes runtime updates with function
     *        deployments, giving you control over when runtime updates are applied and allowing you to detect and
     *        mitigate rare runtime update incompatibilities early. When using this setting, you need to regularly
     *        update your functions to keep their runtime up-to-date.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Manual</b> - You specify a runtime version in your function configuration. The function will use this
     *        runtime version indefinitely. In the rare case where a new runtime version is incompatible with an
     *        existing function, this allows you to roll back your function to an earlier runtime version. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-rollback">Roll
     *        back a runtime version</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateRuntimeOn
     */

    public PutRuntimeManagementConfigRequest withUpdateRuntimeOn(String updateRuntimeOn) {
        setUpdateRuntimeOn(updateRuntimeOn);
        return this;
    }

    /**
     * <p>
     * Specify the runtime update mode.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Auto (default)</b> - Automatically update to the most recent and secure runtime version using a <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-two-phase">Two-phase
     * runtime version rollout</a>. This is the best choice for most customers to ensure they always benefit from
     * runtime updates.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function update</b> - Lambda updates the runtime of your function to the most recent and secure runtime
     * version when you update your function. This approach synchronizes runtime updates with function deployments,
     * giving you control over when runtime updates are applied and allowing you to detect and mitigate rare runtime
     * update incompatibilities early. When using this setting, you need to regularly update your functions to keep
     * their runtime up-to-date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Manual</b> - You specify a runtime version in your function configuration. The function will use this runtime
     * version indefinitely. In the rare case where a new runtime version is incompatible with an existing function,
     * this allows you to roll back your function to an earlier runtime version. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-rollback">Roll back a
     * runtime version</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateRuntimeOn
     *        Specify the runtime update mode.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Auto (default)</b> - Automatically update to the most recent and secure runtime version using a <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-two-phase">Two-
     *        phase runtime version rollout</a>. This is the best choice for most customers to ensure they always
     *        benefit from runtime updates.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Function update</b> - Lambda updates the runtime of your function to the most recent and secure runtime
     *        version when you update your function. This approach synchronizes runtime updates with function
     *        deployments, giving you control over when runtime updates are applied and allowing you to detect and
     *        mitigate rare runtime update incompatibilities early. When using this setting, you need to regularly
     *        update your functions to keep their runtime up-to-date.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Manual</b> - You specify a runtime version in your function configuration. The function will use this
     *        runtime version indefinitely. In the rare case where a new runtime version is incompatible with an
     *        existing function, this allows you to roll back your function to an earlier runtime version. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-rollback">Roll
     *        back a runtime version</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateRuntimeOn
     */

    public PutRuntimeManagementConfigRequest withUpdateRuntimeOn(UpdateRuntimeOn updateRuntimeOn) {
        this.updateRuntimeOn = updateRuntimeOn.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the runtime version you want the function to use.
     * </p>
     * <note>
     * <p>
     * This is only required if you're using the <b>Manual</b> runtime update mode.
     * </p>
     * </note>
     * 
     * @param runtimeVersionArn
     *        The ARN of the runtime version you want the function to use.</p> <note>
     *        <p>
     *        This is only required if you're using the <b>Manual</b> runtime update mode.
     *        </p>
     */

    public void setRuntimeVersionArn(String runtimeVersionArn) {
        this.runtimeVersionArn = runtimeVersionArn;
    }

    /**
     * <p>
     * The ARN of the runtime version you want the function to use.
     * </p>
     * <note>
     * <p>
     * This is only required if you're using the <b>Manual</b> runtime update mode.
     * </p>
     * </note>
     * 
     * @return The ARN of the runtime version you want the function to use.</p> <note>
     *         <p>
     *         This is only required if you're using the <b>Manual</b> runtime update mode.
     *         </p>
     */

    public String getRuntimeVersionArn() {
        return this.runtimeVersionArn;
    }

    /**
     * <p>
     * The ARN of the runtime version you want the function to use.
     * </p>
     * <note>
     * <p>
     * This is only required if you're using the <b>Manual</b> runtime update mode.
     * </p>
     * </note>
     * 
     * @param runtimeVersionArn
     *        The ARN of the runtime version you want the function to use.</p> <note>
     *        <p>
     *        This is only required if you're using the <b>Manual</b> runtime update mode.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRuntimeManagementConfigRequest withRuntimeVersionArn(String runtimeVersionArn) {
        setRuntimeVersionArn(runtimeVersionArn);
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
        if (getFunctionName() != null)
            sb.append("FunctionName: ").append(getFunctionName()).append(",");
        if (getQualifier() != null)
            sb.append("Qualifier: ").append(getQualifier()).append(",");
        if (getUpdateRuntimeOn() != null)
            sb.append("UpdateRuntimeOn: ").append(getUpdateRuntimeOn()).append(",");
        if (getRuntimeVersionArn() != null)
            sb.append("RuntimeVersionArn: ").append(getRuntimeVersionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRuntimeManagementConfigRequest == false)
            return false;
        PutRuntimeManagementConfigRequest other = (PutRuntimeManagementConfigRequest) obj;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getQualifier() == null ^ this.getQualifier() == null)
            return false;
        if (other.getQualifier() != null && other.getQualifier().equals(this.getQualifier()) == false)
            return false;
        if (other.getUpdateRuntimeOn() == null ^ this.getUpdateRuntimeOn() == null)
            return false;
        if (other.getUpdateRuntimeOn() != null && other.getUpdateRuntimeOn().equals(this.getUpdateRuntimeOn()) == false)
            return false;
        if (other.getRuntimeVersionArn() == null ^ this.getRuntimeVersionArn() == null)
            return false;
        if (other.getRuntimeVersionArn() != null && other.getRuntimeVersionArn().equals(this.getRuntimeVersionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getQualifier() == null) ? 0 : getQualifier().hashCode());
        hashCode = prime * hashCode + ((getUpdateRuntimeOn() == null) ? 0 : getUpdateRuntimeOn().hashCode());
        hashCode = prime * hashCode + ((getRuntimeVersionArn() == null) ? 0 : getRuntimeVersionArn().hashCode());
        return hashCode;
    }

    @Override
    public PutRuntimeManagementConfigRequest clone() {
        return (PutRuntimeManagementConfigRequest) super.clone();
    }

}
