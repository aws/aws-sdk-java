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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The status of the scan.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ScanStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScanStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The scan status. Possible return values and descriptions are:
     * </p>
     * <p>
     * <code>PENDING_INITIAL_SCAN</code> - This resource has been identified for scanning, results will be available
     * soon.
     * </p>
     * <p>
     * <code>ACCESS_DENIED</code> - Resource access policy restricting Amazon Inspector access. Please update the IAM
     * policy.
     * </p>
     * <p>
     * <code>INTERNAL_ERROR</code> - Amazon Inspector has encountered an internal error for this resource. Amazon
     * Inspector service will automatically resolve the issue and resume the scanning. No action required from the user.
     * </p>
     * <p>
     * <code>UNMANAGED_EC2_INSTANCE</code> - The EC2 instance is not managed by SSM, please use the following SSM
     * automation to remediate the issue: <a href=
     * "https://docs.aws.amazon.com/systems-manager-automation-runbooks/latest/userguide/automation-awssupport-troubleshoot-managed-instance.html"
     * >https://docs.aws.amazon.com/systems-manager-automation-runbooks/latest/userguide/automation-awssupport-
     * troubleshoot-managed-instance.html</a>. Once the instance becomes managed by SSM, Inspector will automatically
     * begin scanning this instance.
     * </p>
     * <p>
     * <code>UNSUPPORTED_OS</code> - Amazon Inspector does not support this OS, architecture, or image manifest type at
     * this time. To see a complete list of supported operating systems see: <a
     * href=" https://docs.aws.amazon.com/inspector/latest/user/supported.html"
     * >https://docs.aws.amazon.com/inspector/latest/user/supported.html</a>.
     * </p>
     * <p>
     * <code>SCAN_ELIGIBILITY_EXPIRED</code> - The configured scan duration has lapsed for this image.
     * </p>
     * <p>
     * <code>RESOURCE_TERMINATED</code> - This resource has been terminated. The findings and coverage associated with
     * this resource are in the process of being cleaned up.
     * </p>
     * <p>
     * <code>SUCCESSFUL</code> - The scan was successful.
     * </p>
     * <p>
     * <code>NO_RESOURCES_FOUND</code> - Reserved for future use.
     * </p>
     * <p>
     * <code>IMAGE_SIZE_EXCEEDED</code> - Reserved for future use.
     * </p>
     * <p>
     * <code>SCAN_FREQUENCY_MANUAL</code> - This image will not be covered by Amazon Inspector due to the repository
     * scan frequency configuration.
     * </p>
     * <p>
     * <code>SCAN_FREQUENCY_SCAN_ON_PUSH </code>- This image will be scanned one time and will not new findings because
     * of the scan frequency configuration.
     * </p>
     * <p>
     * <code>EC2_INSTANCE_STOPPED</code> - This EC2 instance is in a stopped state, therefore, Amazon Inspector will
     * pause scanning. The existing findings will continue to exist until the instance is terminated. Once the instance
     * is re-started, Inspector will automatically start scanning the instance again. Please note that you will not be
     * charged for this instance while it’s in a stopped state.
     * </p>
     * <p>
     * <code>PENDING_DISABLE</code> - This resource is pending cleanup during disablement. The customer will not be
     * billed while a resource is in the pending disable status.
     * </p>
     * <p>
     * <code>NO INVENTORY</code> - Amazon Inspector couldn’t find software application inventory to scan for
     * vulnerabilities. This might be caused due to required Amazon Inspector associations being deleted or failing to
     * run on your resource. Please verify the status of <code>InspectorInventoryCollection-do-not-delete</code>
     * association in the SSM console for the resource. Additionally, you can verify the instance’s inventory in the SSM
     * Fleet Manager console.
     * </p>
     * <p>
     * <code>STALE_INVENTORY</code> - Amazon Inspector wasn’t able to collect an updated software application inventory
     * in the last 7 days. Please confirm the required Amazon Inspector associations still exist and you can still see
     * an updated inventory in the SSM console.
     * </p>
     * <p>
     * <code>EXCLUDED_BY_TAG</code> - This resource was not scanned because it has been excluded by a tag.
     * </p>
     * <p>
     * <code>UNSUPPORTED_RUNTIME</code> - The function was not scanned because it has an unsupported runtime. To see a
     * complete list of supported runtimes see: <a
     * href=" https://docs.aws.amazon.com/inspector/latest/user/supported.html"
     * >https://docs.aws.amazon.com/inspector/latest/user/supported.html</a>.
     * </p>
     * <p>
     * <code>UNSUPPORTED_MEDIA_TYPE </code>- The ECR image has an unsupported media type.
     * </p>
     * <p>
     * <code>UNSUPPORTED_CONFIG_FILE</code> - Reserved for future use.
     * </p>
     * <p>
     * <code>DEEP_INSPECTION_PACKAGE_COLLECTION_LIMIT_EXCEEDED</code> - The instance has exceeded the 5000 package limit
     * for Amazon Inspector Deep inspection. To resume Deep inspection for this instance you can try to adjust the
     * custom paths associated with the account.
     * </p>
     * <p>
     * <code>DEEP_INSPECTION_DAILY_SSM_INVENTORY_LIMIT_EXCEEDED</code> - The SSM agent couldn't send inventory to Amazon
     * Inspector because the SSM quota for Inventory data collected per instance per day has already been reached for
     * this instance.
     * </p>
     * <p>
     * <code>DEEP_INSPECTION_COLLECTION_TIME_LIMIT_EXCEEDED</code> - Amazon Inspector failed to extract the package
     * inventory because the package collection time exceeding the maximum threshold of 15 minutes.
     * </p>
     * <p>
     * <code>DEEP_INSPECTION_NO_INVENTORY</code> The Amazon Inspector plugin hasn't yet been able to collect an
     * inventory of packages for this instance. This is usually the result of a pending scan, however, if this status
     * persists after 6 hours, use SSM to ensure that the required Amazon Inspector associations exist and are running
     * for the instance.
     * </p>
     * <p/>
     */
    private String reason;
    /**
     * <p>
     * The status code of the scan.
     * </p>
     */
    private String statusCode;

    /**
     * <p>
     * The scan status. Possible return values and descriptions are:
     * </p>
     * <p>
     * <code>PENDING_INITIAL_SCAN</code> - This resource has been identified for scanning, results will be available
     * soon.
     * </p>
     * <p>
     * <code>ACCESS_DENIED</code> - Resource access policy restricting Amazon Inspector access. Please update the IAM
     * policy.
     * </p>
     * <p>
     * <code>INTERNAL_ERROR</code> - Amazon Inspector has encountered an internal error for this resource. Amazon
     * Inspector service will automatically resolve the issue and resume the scanning. No action required from the user.
     * </p>
     * <p>
     * <code>UNMANAGED_EC2_INSTANCE</code> - The EC2 instance is not managed by SSM, please use the following SSM
     * automation to remediate the issue: <a href=
     * "https://docs.aws.amazon.com/systems-manager-automation-runbooks/latest/userguide/automation-awssupport-troubleshoot-managed-instance.html"
     * >https://docs.aws.amazon.com/systems-manager-automation-runbooks/latest/userguide/automation-awssupport-
     * troubleshoot-managed-instance.html</a>. Once the instance becomes managed by SSM, Inspector will automatically
     * begin scanning this instance.
     * </p>
     * <p>
     * <code>UNSUPPORTED_OS</code> - Amazon Inspector does not support this OS, architecture, or image manifest type at
     * this time. To see a complete list of supported operating systems see: <a
     * href=" https://docs.aws.amazon.com/inspector/latest/user/supported.html"
     * >https://docs.aws.amazon.com/inspector/latest/user/supported.html</a>.
     * </p>
     * <p>
     * <code>SCAN_ELIGIBILITY_EXPIRED</code> - The configured scan duration has lapsed for this image.
     * </p>
     * <p>
     * <code>RESOURCE_TERMINATED</code> - This resource has been terminated. The findings and coverage associated with
     * this resource are in the process of being cleaned up.
     * </p>
     * <p>
     * <code>SUCCESSFUL</code> - The scan was successful.
     * </p>
     * <p>
     * <code>NO_RESOURCES_FOUND</code> - Reserved for future use.
     * </p>
     * <p>
     * <code>IMAGE_SIZE_EXCEEDED</code> - Reserved for future use.
     * </p>
     * <p>
     * <code>SCAN_FREQUENCY_MANUAL</code> - This image will not be covered by Amazon Inspector due to the repository
     * scan frequency configuration.
     * </p>
     * <p>
     * <code>SCAN_FREQUENCY_SCAN_ON_PUSH </code>- This image will be scanned one time and will not new findings because
     * of the scan frequency configuration.
     * </p>
     * <p>
     * <code>EC2_INSTANCE_STOPPED</code> - This EC2 instance is in a stopped state, therefore, Amazon Inspector will
     * pause scanning. The existing findings will continue to exist until the instance is terminated. Once the instance
     * is re-started, Inspector will automatically start scanning the instance again. Please note that you will not be
     * charged for this instance while it’s in a stopped state.
     * </p>
     * <p>
     * <code>PENDING_DISABLE</code> - This resource is pending cleanup during disablement. The customer will not be
     * billed while a resource is in the pending disable status.
     * </p>
     * <p>
     * <code>NO INVENTORY</code> - Amazon Inspector couldn’t find software application inventory to scan for
     * vulnerabilities. This might be caused due to required Amazon Inspector associations being deleted or failing to
     * run on your resource. Please verify the status of <code>InspectorInventoryCollection-do-not-delete</code>
     * association in the SSM console for the resource. Additionally, you can verify the instance’s inventory in the SSM
     * Fleet Manager console.
     * </p>
     * <p>
     * <code>STALE_INVENTORY</code> - Amazon Inspector wasn’t able to collect an updated software application inventory
     * in the last 7 days. Please confirm the required Amazon Inspector associations still exist and you can still see
     * an updated inventory in the SSM console.
     * </p>
     * <p>
     * <code>EXCLUDED_BY_TAG</code> - This resource was not scanned because it has been excluded by a tag.
     * </p>
     * <p>
     * <code>UNSUPPORTED_RUNTIME</code> - The function was not scanned because it has an unsupported runtime. To see a
     * complete list of supported runtimes see: <a
     * href=" https://docs.aws.amazon.com/inspector/latest/user/supported.html"
     * >https://docs.aws.amazon.com/inspector/latest/user/supported.html</a>.
     * </p>
     * <p>
     * <code>UNSUPPORTED_MEDIA_TYPE </code>- The ECR image has an unsupported media type.
     * </p>
     * <p>
     * <code>UNSUPPORTED_CONFIG_FILE</code> - Reserved for future use.
     * </p>
     * <p>
     * <code>DEEP_INSPECTION_PACKAGE_COLLECTION_LIMIT_EXCEEDED</code> - The instance has exceeded the 5000 package limit
     * for Amazon Inspector Deep inspection. To resume Deep inspection for this instance you can try to adjust the
     * custom paths associated with the account.
     * </p>
     * <p>
     * <code>DEEP_INSPECTION_DAILY_SSM_INVENTORY_LIMIT_EXCEEDED</code> - The SSM agent couldn't send inventory to Amazon
     * Inspector because the SSM quota for Inventory data collected per instance per day has already been reached for
     * this instance.
     * </p>
     * <p>
     * <code>DEEP_INSPECTION_COLLECTION_TIME_LIMIT_EXCEEDED</code> - Amazon Inspector failed to extract the package
     * inventory because the package collection time exceeding the maximum threshold of 15 minutes.
     * </p>
     * <p>
     * <code>DEEP_INSPECTION_NO_INVENTORY</code> The Amazon Inspector plugin hasn't yet been able to collect an
     * inventory of packages for this instance. This is usually the result of a pending scan, however, if this status
     * persists after 6 hours, use SSM to ensure that the required Amazon Inspector associations exist and are running
     * for the instance.
     * </p>
     * <p/>
     * 
     * @param reason
     *        The scan status. Possible return values and descriptions are:
     *        </p>
     *        <p>
     *        <code>PENDING_INITIAL_SCAN</code> - This resource has been identified for scanning, results will be
     *        available soon.
     *        </p>
     *        <p>
     *        <code>ACCESS_DENIED</code> - Resource access policy restricting Amazon Inspector access. Please update the
     *        IAM policy.
     *        </p>
     *        <p>
     *        <code>INTERNAL_ERROR</code> - Amazon Inspector has encountered an internal error for this resource. Amazon
     *        Inspector service will automatically resolve the issue and resume the scanning. No action required from
     *        the user.
     *        </p>
     *        <p>
     *        <code>UNMANAGED_EC2_INSTANCE</code> - The EC2 instance is not managed by SSM, please use the following SSM
     *        automation to remediate the issue: <a href=
     *        "https://docs.aws.amazon.com/systems-manager-automation-runbooks/latest/userguide/automation-awssupport-troubleshoot-managed-instance.html"
     *        >https://docs.aws.amazon.com/systems-manager-automation-runbooks/latest/userguide/automation-awssupport-
     *        troubleshoot-managed-instance.html</a>. Once the instance becomes managed by SSM, Inspector will
     *        automatically begin scanning this instance.
     *        </p>
     *        <p>
     *        <code>UNSUPPORTED_OS</code> - Amazon Inspector does not support this OS, architecture, or image manifest
     *        type at this time. To see a complete list of supported operating systems see: <a
     *        href=" https://docs.aws.amazon.com/inspector/latest/user/supported.html"
     *        >https://docs.aws.amazon.com/inspector/latest/user/supported.html</a>.
     *        </p>
     *        <p>
     *        <code>SCAN_ELIGIBILITY_EXPIRED</code> - The configured scan duration has lapsed for this image.
     *        </p>
     *        <p>
     *        <code>RESOURCE_TERMINATED</code> - This resource has been terminated. The findings and coverage associated
     *        with this resource are in the process of being cleaned up.
     *        </p>
     *        <p>
     *        <code>SUCCESSFUL</code> - The scan was successful.
     *        </p>
     *        <p>
     *        <code>NO_RESOURCES_FOUND</code> - Reserved for future use.
     *        </p>
     *        <p>
     *        <code>IMAGE_SIZE_EXCEEDED</code> - Reserved for future use.
     *        </p>
     *        <p>
     *        <code>SCAN_FREQUENCY_MANUAL</code> - This image will not be covered by Amazon Inspector due to the
     *        repository scan frequency configuration.
     *        </p>
     *        <p>
     *        <code>SCAN_FREQUENCY_SCAN_ON_PUSH </code>- This image will be scanned one time and will not new findings
     *        because of the scan frequency configuration.
     *        </p>
     *        <p>
     *        <code>EC2_INSTANCE_STOPPED</code> - This EC2 instance is in a stopped state, therefore, Amazon Inspector
     *        will pause scanning. The existing findings will continue to exist until the instance is terminated. Once
     *        the instance is re-started, Inspector will automatically start scanning the instance again. Please note
     *        that you will not be charged for this instance while it’s in a stopped state.
     *        </p>
     *        <p>
     *        <code>PENDING_DISABLE</code> - This resource is pending cleanup during disablement. The customer will not
     *        be billed while a resource is in the pending disable status.
     *        </p>
     *        <p>
     *        <code>NO INVENTORY</code> - Amazon Inspector couldn’t find software application inventory to scan for
     *        vulnerabilities. This might be caused due to required Amazon Inspector associations being deleted or
     *        failing to run on your resource. Please verify the status of
     *        <code>InspectorInventoryCollection-do-not-delete</code> association in the SSM console for the resource.
     *        Additionally, you can verify the instance’s inventory in the SSM Fleet Manager console.
     *        </p>
     *        <p>
     *        <code>STALE_INVENTORY</code> - Amazon Inspector wasn’t able to collect an updated software application
     *        inventory in the last 7 days. Please confirm the required Amazon Inspector associations still exist and
     *        you can still see an updated inventory in the SSM console.
     *        </p>
     *        <p>
     *        <code>EXCLUDED_BY_TAG</code> - This resource was not scanned because it has been excluded by a tag.
     *        </p>
     *        <p>
     *        <code>UNSUPPORTED_RUNTIME</code> - The function was not scanned because it has an unsupported runtime. To
     *        see a complete list of supported runtimes see: <a
     *        href=" https://docs.aws.amazon.com/inspector/latest/user/supported.html"
     *        >https://docs.aws.amazon.com/inspector/latest/user/supported.html</a>.
     *        </p>
     *        <p>
     *        <code>UNSUPPORTED_MEDIA_TYPE </code>- The ECR image has an unsupported media type.
     *        </p>
     *        <p>
     *        <code>UNSUPPORTED_CONFIG_FILE</code> - Reserved for future use.
     *        </p>
     *        <p>
     *        <code>DEEP_INSPECTION_PACKAGE_COLLECTION_LIMIT_EXCEEDED</code> - The instance has exceeded the 5000
     *        package limit for Amazon Inspector Deep inspection. To resume Deep inspection for this instance you can
     *        try to adjust the custom paths associated with the account.
     *        </p>
     *        <p>
     *        <code>DEEP_INSPECTION_DAILY_SSM_INVENTORY_LIMIT_EXCEEDED</code> - The SSM agent couldn't send inventory to
     *        Amazon Inspector because the SSM quota for Inventory data collected per instance per day has already been
     *        reached for this instance.
     *        </p>
     *        <p>
     *        <code>DEEP_INSPECTION_COLLECTION_TIME_LIMIT_EXCEEDED</code> - Amazon Inspector failed to extract the
     *        package inventory because the package collection time exceeding the maximum threshold of 15 minutes.
     *        </p>
     *        <p>
     *        <code>DEEP_INSPECTION_NO_INVENTORY</code> The Amazon Inspector plugin hasn't yet been able to collect an
     *        inventory of packages for this instance. This is usually the result of a pending scan, however, if this
     *        status persists after 6 hours, use SSM to ensure that the required Amazon Inspector associations exist and
     *        are running for the instance.
     *        </p>
     * @see ScanStatusReason
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The scan status. Possible return values and descriptions are:
     * </p>
     * <p>
     * <code>PENDING_INITIAL_SCAN</code> - This resource has been identified for scanning, results will be available
     * soon.
     * </p>
     * <p>
     * <code>ACCESS_DENIED</code> - Resource access policy restricting Amazon Inspector access. Please update the IAM
     * policy.
     * </p>
     * <p>
     * <code>INTERNAL_ERROR</code> - Amazon Inspector has encountered an internal error for this resource. Amazon
     * Inspector service will automatically resolve the issue and resume the scanning. No action required from the user.
     * </p>
     * <p>
     * <code>UNMANAGED_EC2_INSTANCE</code> - The EC2 instance is not managed by SSM, please use the following SSM
     * automation to remediate the issue: <a href=
     * "https://docs.aws.amazon.com/systems-manager-automation-runbooks/latest/userguide/automation-awssupport-troubleshoot-managed-instance.html"
     * >https://docs.aws.amazon.com/systems-manager-automation-runbooks/latest/userguide/automation-awssupport-
     * troubleshoot-managed-instance.html</a>. Once the instance becomes managed by SSM, Inspector will automatically
     * begin scanning this instance.
     * </p>
     * <p>
     * <code>UNSUPPORTED_OS</code> - Amazon Inspector does not support this OS, architecture, or image manifest type at
     * this time. To see a complete list of supported operating systems see: <a
     * href=" https://docs.aws.amazon.com/inspector/latest/user/supported.html"
     * >https://docs.aws.amazon.com/inspector/latest/user/supported.html</a>.
     * </p>
     * <p>
     * <code>SCAN_ELIGIBILITY_EXPIRED</code> - The configured scan duration has lapsed for this image.
     * </p>
     * <p>
     * <code>RESOURCE_TERMINATED</code> - This resource has been terminated. The findings and coverage associated with
     * this resource are in the process of being cleaned up.
     * </p>
     * <p>
     * <code>SUCCESSFUL</code> - The scan was successful.
     * </p>
     * <p>
     * <code>NO_RESOURCES_FOUND</code> - Reserved for future use.
     * </p>
     * <p>
     * <code>IMAGE_SIZE_EXCEEDED</code> - Reserved for future use.
     * </p>
     * <p>
     * <code>SCAN_FREQUENCY_MANUAL</code> - This image will not be covered by Amazon Inspector due to the repository
     * scan frequency configuration.
     * </p>
     * <p>
     * <code>SCAN_FREQUENCY_SCAN_ON_PUSH </code>- This image will be scanned one time and will not new findings because
     * of the scan frequency configuration.
     * </p>
     * <p>
     * <code>EC2_INSTANCE_STOPPED</code> - This EC2 instance is in a stopped state, therefore, Amazon Inspector will
     * pause scanning. The existing findings will continue to exist until the instance is terminated. Once the instance
     * is re-started, Inspector will automatically start scanning the instance again. Please note that you will not be
     * charged for this instance while it’s in a stopped state.
     * </p>
     * <p>
     * <code>PENDING_DISABLE</code> - This resource is pending cleanup during disablement. The customer will not be
     * billed while a resource is in the pending disable status.
     * </p>
     * <p>
     * <code>NO INVENTORY</code> - Amazon Inspector couldn’t find software application inventory to scan for
     * vulnerabilities. This might be caused due to required Amazon Inspector associations being deleted or failing to
     * run on your resource. Please verify the status of <code>InspectorInventoryCollection-do-not-delete</code>
     * association in the SSM console for the resource. Additionally, you can verify the instance’s inventory in the SSM
     * Fleet Manager console.
     * </p>
     * <p>
     * <code>STALE_INVENTORY</code> - Amazon Inspector wasn’t able to collect an updated software application inventory
     * in the last 7 days. Please confirm the required Amazon Inspector associations still exist and you can still see
     * an updated inventory in the SSM console.
     * </p>
     * <p>
     * <code>EXCLUDED_BY_TAG</code> - This resource was not scanned because it has been excluded by a tag.
     * </p>
     * <p>
     * <code>UNSUPPORTED_RUNTIME</code> - The function was not scanned because it has an unsupported runtime. To see a
     * complete list of supported runtimes see: <a
     * href=" https://docs.aws.amazon.com/inspector/latest/user/supported.html"
     * >https://docs.aws.amazon.com/inspector/latest/user/supported.html</a>.
     * </p>
     * <p>
     * <code>UNSUPPORTED_MEDIA_TYPE </code>- The ECR image has an unsupported media type.
     * </p>
     * <p>
     * <code>UNSUPPORTED_CONFIG_FILE</code> - Reserved for future use.
     * </p>
     * <p>
     * <code>DEEP_INSPECTION_PACKAGE_COLLECTION_LIMIT_EXCEEDED</code> - The instance has exceeded the 5000 package limit
     * for Amazon Inspector Deep inspection. To resume Deep inspection for this instance you can try to adjust the
     * custom paths associated with the account.
     * </p>
     * <p>
     * <code>DEEP_INSPECTION_DAILY_SSM_INVENTORY_LIMIT_EXCEEDED</code> - The SSM agent couldn't send inventory to Amazon
     * Inspector because the SSM quota for Inventory data collected per instance per day has already been reached for
     * this instance.
     * </p>
     * <p>
     * <code>DEEP_INSPECTION_COLLECTION_TIME_LIMIT_EXCEEDED</code> - Amazon Inspector failed to extract the package
     * inventory because the package collection time exceeding the maximum threshold of 15 minutes.
     * </p>
     * <p>
     * <code>DEEP_INSPECTION_NO_INVENTORY</code> The Amazon Inspector plugin hasn't yet been able to collect an
     * inventory of packages for this instance. This is usually the result of a pending scan, however, if this status
     * persists after 6 hours, use SSM to ensure that the required Amazon Inspector associations exist and are running
     * for the instance.
     * </p>
     * <p/>
     * 
     * @return The scan status. Possible return values and descriptions are:
     *         </p>
     *         <p>
     *         <code>PENDING_INITIAL_SCAN</code> - This resource has been identified for scanning, results will be
     *         available soon.
     *         </p>
     *         <p>
     *         <code>ACCESS_DENIED</code> - Resource access policy restricting Amazon Inspector access. Please update
     *         the IAM policy.
     *         </p>
     *         <p>
     *         <code>INTERNAL_ERROR</code> - Amazon Inspector has encountered an internal error for this resource.
     *         Amazon Inspector service will automatically resolve the issue and resume the scanning. No action required
     *         from the user.
     *         </p>
     *         <p>
     *         <code>UNMANAGED_EC2_INSTANCE</code> - The EC2 instance is not managed by SSM, please use the following
     *         SSM automation to remediate the issue: <a href=
     *         "https://docs.aws.amazon.com/systems-manager-automation-runbooks/latest/userguide/automation-awssupport-troubleshoot-managed-instance.html"
     *         >https://docs.aws.amazon.com/systems-manager-automation-runbooks/latest/userguide/automation-awssupport-
     *         troubleshoot-managed-instance.html</a>. Once the instance becomes managed by SSM, Inspector will
     *         automatically begin scanning this instance.
     *         </p>
     *         <p>
     *         <code>UNSUPPORTED_OS</code> - Amazon Inspector does not support this OS, architecture, or image manifest
     *         type at this time. To see a complete list of supported operating systems see: <a
     *         href=" https://docs.aws.amazon.com/inspector/latest/user/supported.html"
     *         >https://docs.aws.amazon.com/inspector/latest/user/supported.html</a>.
     *         </p>
     *         <p>
     *         <code>SCAN_ELIGIBILITY_EXPIRED</code> - The configured scan duration has lapsed for this image.
     *         </p>
     *         <p>
     *         <code>RESOURCE_TERMINATED</code> - This resource has been terminated. The findings and coverage
     *         associated with this resource are in the process of being cleaned up.
     *         </p>
     *         <p>
     *         <code>SUCCESSFUL</code> - The scan was successful.
     *         </p>
     *         <p>
     *         <code>NO_RESOURCES_FOUND</code> - Reserved for future use.
     *         </p>
     *         <p>
     *         <code>IMAGE_SIZE_EXCEEDED</code> - Reserved for future use.
     *         </p>
     *         <p>
     *         <code>SCAN_FREQUENCY_MANUAL</code> - This image will not be covered by Amazon Inspector due to the
     *         repository scan frequency configuration.
     *         </p>
     *         <p>
     *         <code>SCAN_FREQUENCY_SCAN_ON_PUSH </code>- This image will be scanned one time and will not new findings
     *         because of the scan frequency configuration.
     *         </p>
     *         <p>
     *         <code>EC2_INSTANCE_STOPPED</code> - This EC2 instance is in a stopped state, therefore, Amazon Inspector
     *         will pause scanning. The existing findings will continue to exist until the instance is terminated. Once
     *         the instance is re-started, Inspector will automatically start scanning the instance again. Please note
     *         that you will not be charged for this instance while it’s in a stopped state.
     *         </p>
     *         <p>
     *         <code>PENDING_DISABLE</code> - This resource is pending cleanup during disablement. The customer will not
     *         be billed while a resource is in the pending disable status.
     *         </p>
     *         <p>
     *         <code>NO INVENTORY</code> - Amazon Inspector couldn’t find software application inventory to scan for
     *         vulnerabilities. This might be caused due to required Amazon Inspector associations being deleted or
     *         failing to run on your resource. Please verify the status of
     *         <code>InspectorInventoryCollection-do-not-delete</code> association in the SSM console for the resource.
     *         Additionally, you can verify the instance’s inventory in the SSM Fleet Manager console.
     *         </p>
     *         <p>
     *         <code>STALE_INVENTORY</code> - Amazon Inspector wasn’t able to collect an updated software application
     *         inventory in the last 7 days. Please confirm the required Amazon Inspector associations still exist and
     *         you can still see an updated inventory in the SSM console.
     *         </p>
     *         <p>
     *         <code>EXCLUDED_BY_TAG</code> - This resource was not scanned because it has been excluded by a tag.
     *         </p>
     *         <p>
     *         <code>UNSUPPORTED_RUNTIME</code> - The function was not scanned because it has an unsupported runtime. To
     *         see a complete list of supported runtimes see: <a
     *         href=" https://docs.aws.amazon.com/inspector/latest/user/supported.html"
     *         >https://docs.aws.amazon.com/inspector/latest/user/supported.html</a>.
     *         </p>
     *         <p>
     *         <code>UNSUPPORTED_MEDIA_TYPE </code>- The ECR image has an unsupported media type.
     *         </p>
     *         <p>
     *         <code>UNSUPPORTED_CONFIG_FILE</code> - Reserved for future use.
     *         </p>
     *         <p>
     *         <code>DEEP_INSPECTION_PACKAGE_COLLECTION_LIMIT_EXCEEDED</code> - The instance has exceeded the 5000
     *         package limit for Amazon Inspector Deep inspection. To resume Deep inspection for this instance you can
     *         try to adjust the custom paths associated with the account.
     *         </p>
     *         <p>
     *         <code>DEEP_INSPECTION_DAILY_SSM_INVENTORY_LIMIT_EXCEEDED</code> - The SSM agent couldn't send inventory
     *         to Amazon Inspector because the SSM quota for Inventory data collected per instance per day has already
     *         been reached for this instance.
     *         </p>
     *         <p>
     *         <code>DEEP_INSPECTION_COLLECTION_TIME_LIMIT_EXCEEDED</code> - Amazon Inspector failed to extract the
     *         package inventory because the package collection time exceeding the maximum threshold of 15 minutes.
     *         </p>
     *         <p>
     *         <code>DEEP_INSPECTION_NO_INVENTORY</code> The Amazon Inspector plugin hasn't yet been able to collect an
     *         inventory of packages for this instance. This is usually the result of a pending scan, however, if this
     *         status persists after 6 hours, use SSM to ensure that the required Amazon Inspector associations exist
     *         and are running for the instance.
     *         </p>
     * @see ScanStatusReason
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The scan status. Possible return values and descriptions are:
     * </p>
     * <p>
     * <code>PENDING_INITIAL_SCAN</code> - This resource has been identified for scanning, results will be available
     * soon.
     * </p>
     * <p>
     * <code>ACCESS_DENIED</code> - Resource access policy restricting Amazon Inspector access. Please update the IAM
     * policy.
     * </p>
     * <p>
     * <code>INTERNAL_ERROR</code> - Amazon Inspector has encountered an internal error for this resource. Amazon
     * Inspector service will automatically resolve the issue and resume the scanning. No action required from the user.
     * </p>
     * <p>
     * <code>UNMANAGED_EC2_INSTANCE</code> - The EC2 instance is not managed by SSM, please use the following SSM
     * automation to remediate the issue: <a href=
     * "https://docs.aws.amazon.com/systems-manager-automation-runbooks/latest/userguide/automation-awssupport-troubleshoot-managed-instance.html"
     * >https://docs.aws.amazon.com/systems-manager-automation-runbooks/latest/userguide/automation-awssupport-
     * troubleshoot-managed-instance.html</a>. Once the instance becomes managed by SSM, Inspector will automatically
     * begin scanning this instance.
     * </p>
     * <p>
     * <code>UNSUPPORTED_OS</code> - Amazon Inspector does not support this OS, architecture, or image manifest type at
     * this time. To see a complete list of supported operating systems see: <a
     * href=" https://docs.aws.amazon.com/inspector/latest/user/supported.html"
     * >https://docs.aws.amazon.com/inspector/latest/user/supported.html</a>.
     * </p>
     * <p>
     * <code>SCAN_ELIGIBILITY_EXPIRED</code> - The configured scan duration has lapsed for this image.
     * </p>
     * <p>
     * <code>RESOURCE_TERMINATED</code> - This resource has been terminated. The findings and coverage associated with
     * this resource are in the process of being cleaned up.
     * </p>
     * <p>
     * <code>SUCCESSFUL</code> - The scan was successful.
     * </p>
     * <p>
     * <code>NO_RESOURCES_FOUND</code> - Reserved for future use.
     * </p>
     * <p>
     * <code>IMAGE_SIZE_EXCEEDED</code> - Reserved for future use.
     * </p>
     * <p>
     * <code>SCAN_FREQUENCY_MANUAL</code> - This image will not be covered by Amazon Inspector due to the repository
     * scan frequency configuration.
     * </p>
     * <p>
     * <code>SCAN_FREQUENCY_SCAN_ON_PUSH </code>- This image will be scanned one time and will not new findings because
     * of the scan frequency configuration.
     * </p>
     * <p>
     * <code>EC2_INSTANCE_STOPPED</code> - This EC2 instance is in a stopped state, therefore, Amazon Inspector will
     * pause scanning. The existing findings will continue to exist until the instance is terminated. Once the instance
     * is re-started, Inspector will automatically start scanning the instance again. Please note that you will not be
     * charged for this instance while it’s in a stopped state.
     * </p>
     * <p>
     * <code>PENDING_DISABLE</code> - This resource is pending cleanup during disablement. The customer will not be
     * billed while a resource is in the pending disable status.
     * </p>
     * <p>
     * <code>NO INVENTORY</code> - Amazon Inspector couldn’t find software application inventory to scan for
     * vulnerabilities. This might be caused due to required Amazon Inspector associations being deleted or failing to
     * run on your resource. Please verify the status of <code>InspectorInventoryCollection-do-not-delete</code>
     * association in the SSM console for the resource. Additionally, you can verify the instance’s inventory in the SSM
     * Fleet Manager console.
     * </p>
     * <p>
     * <code>STALE_INVENTORY</code> - Amazon Inspector wasn’t able to collect an updated software application inventory
     * in the last 7 days. Please confirm the required Amazon Inspector associations still exist and you can still see
     * an updated inventory in the SSM console.
     * </p>
     * <p>
     * <code>EXCLUDED_BY_TAG</code> - This resource was not scanned because it has been excluded by a tag.
     * </p>
     * <p>
     * <code>UNSUPPORTED_RUNTIME</code> - The function was not scanned because it has an unsupported runtime. To see a
     * complete list of supported runtimes see: <a
     * href=" https://docs.aws.amazon.com/inspector/latest/user/supported.html"
     * >https://docs.aws.amazon.com/inspector/latest/user/supported.html</a>.
     * </p>
     * <p>
     * <code>UNSUPPORTED_MEDIA_TYPE </code>- The ECR image has an unsupported media type.
     * </p>
     * <p>
     * <code>UNSUPPORTED_CONFIG_FILE</code> - Reserved for future use.
     * </p>
     * <p>
     * <code>DEEP_INSPECTION_PACKAGE_COLLECTION_LIMIT_EXCEEDED</code> - The instance has exceeded the 5000 package limit
     * for Amazon Inspector Deep inspection. To resume Deep inspection for this instance you can try to adjust the
     * custom paths associated with the account.
     * </p>
     * <p>
     * <code>DEEP_INSPECTION_DAILY_SSM_INVENTORY_LIMIT_EXCEEDED</code> - The SSM agent couldn't send inventory to Amazon
     * Inspector because the SSM quota for Inventory data collected per instance per day has already been reached for
     * this instance.
     * </p>
     * <p>
     * <code>DEEP_INSPECTION_COLLECTION_TIME_LIMIT_EXCEEDED</code> - Amazon Inspector failed to extract the package
     * inventory because the package collection time exceeding the maximum threshold of 15 minutes.
     * </p>
     * <p>
     * <code>DEEP_INSPECTION_NO_INVENTORY</code> The Amazon Inspector plugin hasn't yet been able to collect an
     * inventory of packages for this instance. This is usually the result of a pending scan, however, if this status
     * persists after 6 hours, use SSM to ensure that the required Amazon Inspector associations exist and are running
     * for the instance.
     * </p>
     * <p/>
     * 
     * @param reason
     *        The scan status. Possible return values and descriptions are:
     *        </p>
     *        <p>
     *        <code>PENDING_INITIAL_SCAN</code> - This resource has been identified for scanning, results will be
     *        available soon.
     *        </p>
     *        <p>
     *        <code>ACCESS_DENIED</code> - Resource access policy restricting Amazon Inspector access. Please update the
     *        IAM policy.
     *        </p>
     *        <p>
     *        <code>INTERNAL_ERROR</code> - Amazon Inspector has encountered an internal error for this resource. Amazon
     *        Inspector service will automatically resolve the issue and resume the scanning. No action required from
     *        the user.
     *        </p>
     *        <p>
     *        <code>UNMANAGED_EC2_INSTANCE</code> - The EC2 instance is not managed by SSM, please use the following SSM
     *        automation to remediate the issue: <a href=
     *        "https://docs.aws.amazon.com/systems-manager-automation-runbooks/latest/userguide/automation-awssupport-troubleshoot-managed-instance.html"
     *        >https://docs.aws.amazon.com/systems-manager-automation-runbooks/latest/userguide/automation-awssupport-
     *        troubleshoot-managed-instance.html</a>. Once the instance becomes managed by SSM, Inspector will
     *        automatically begin scanning this instance.
     *        </p>
     *        <p>
     *        <code>UNSUPPORTED_OS</code> - Amazon Inspector does not support this OS, architecture, or image manifest
     *        type at this time. To see a complete list of supported operating systems see: <a
     *        href=" https://docs.aws.amazon.com/inspector/latest/user/supported.html"
     *        >https://docs.aws.amazon.com/inspector/latest/user/supported.html</a>.
     *        </p>
     *        <p>
     *        <code>SCAN_ELIGIBILITY_EXPIRED</code> - The configured scan duration has lapsed for this image.
     *        </p>
     *        <p>
     *        <code>RESOURCE_TERMINATED</code> - This resource has been terminated. The findings and coverage associated
     *        with this resource are in the process of being cleaned up.
     *        </p>
     *        <p>
     *        <code>SUCCESSFUL</code> - The scan was successful.
     *        </p>
     *        <p>
     *        <code>NO_RESOURCES_FOUND</code> - Reserved for future use.
     *        </p>
     *        <p>
     *        <code>IMAGE_SIZE_EXCEEDED</code> - Reserved for future use.
     *        </p>
     *        <p>
     *        <code>SCAN_FREQUENCY_MANUAL</code> - This image will not be covered by Amazon Inspector due to the
     *        repository scan frequency configuration.
     *        </p>
     *        <p>
     *        <code>SCAN_FREQUENCY_SCAN_ON_PUSH </code>- This image will be scanned one time and will not new findings
     *        because of the scan frequency configuration.
     *        </p>
     *        <p>
     *        <code>EC2_INSTANCE_STOPPED</code> - This EC2 instance is in a stopped state, therefore, Amazon Inspector
     *        will pause scanning. The existing findings will continue to exist until the instance is terminated. Once
     *        the instance is re-started, Inspector will automatically start scanning the instance again. Please note
     *        that you will not be charged for this instance while it’s in a stopped state.
     *        </p>
     *        <p>
     *        <code>PENDING_DISABLE</code> - This resource is pending cleanup during disablement. The customer will not
     *        be billed while a resource is in the pending disable status.
     *        </p>
     *        <p>
     *        <code>NO INVENTORY</code> - Amazon Inspector couldn’t find software application inventory to scan for
     *        vulnerabilities. This might be caused due to required Amazon Inspector associations being deleted or
     *        failing to run on your resource. Please verify the status of
     *        <code>InspectorInventoryCollection-do-not-delete</code> association in the SSM console for the resource.
     *        Additionally, you can verify the instance’s inventory in the SSM Fleet Manager console.
     *        </p>
     *        <p>
     *        <code>STALE_INVENTORY</code> - Amazon Inspector wasn’t able to collect an updated software application
     *        inventory in the last 7 days. Please confirm the required Amazon Inspector associations still exist and
     *        you can still see an updated inventory in the SSM console.
     *        </p>
     *        <p>
     *        <code>EXCLUDED_BY_TAG</code> - This resource was not scanned because it has been excluded by a tag.
     *        </p>
     *        <p>
     *        <code>UNSUPPORTED_RUNTIME</code> - The function was not scanned because it has an unsupported runtime. To
     *        see a complete list of supported runtimes see: <a
     *        href=" https://docs.aws.amazon.com/inspector/latest/user/supported.html"
     *        >https://docs.aws.amazon.com/inspector/latest/user/supported.html</a>.
     *        </p>
     *        <p>
     *        <code>UNSUPPORTED_MEDIA_TYPE </code>- The ECR image has an unsupported media type.
     *        </p>
     *        <p>
     *        <code>UNSUPPORTED_CONFIG_FILE</code> - Reserved for future use.
     *        </p>
     *        <p>
     *        <code>DEEP_INSPECTION_PACKAGE_COLLECTION_LIMIT_EXCEEDED</code> - The instance has exceeded the 5000
     *        package limit for Amazon Inspector Deep inspection. To resume Deep inspection for this instance you can
     *        try to adjust the custom paths associated with the account.
     *        </p>
     *        <p>
     *        <code>DEEP_INSPECTION_DAILY_SSM_INVENTORY_LIMIT_EXCEEDED</code> - The SSM agent couldn't send inventory to
     *        Amazon Inspector because the SSM quota for Inventory data collected per instance per day has already been
     *        reached for this instance.
     *        </p>
     *        <p>
     *        <code>DEEP_INSPECTION_COLLECTION_TIME_LIMIT_EXCEEDED</code> - Amazon Inspector failed to extract the
     *        package inventory because the package collection time exceeding the maximum threshold of 15 minutes.
     *        </p>
     *        <p>
     *        <code>DEEP_INSPECTION_NO_INVENTORY</code> The Amazon Inspector plugin hasn't yet been able to collect an
     *        inventory of packages for this instance. This is usually the result of a pending scan, however, if this
     *        status persists after 6 hours, use SSM to ensure that the required Amazon Inspector associations exist and
     *        are running for the instance.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanStatusReason
     */

    public ScanStatus withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The scan status. Possible return values and descriptions are:
     * </p>
     * <p>
     * <code>PENDING_INITIAL_SCAN</code> - This resource has been identified for scanning, results will be available
     * soon.
     * </p>
     * <p>
     * <code>ACCESS_DENIED</code> - Resource access policy restricting Amazon Inspector access. Please update the IAM
     * policy.
     * </p>
     * <p>
     * <code>INTERNAL_ERROR</code> - Amazon Inspector has encountered an internal error for this resource. Amazon
     * Inspector service will automatically resolve the issue and resume the scanning. No action required from the user.
     * </p>
     * <p>
     * <code>UNMANAGED_EC2_INSTANCE</code> - The EC2 instance is not managed by SSM, please use the following SSM
     * automation to remediate the issue: <a href=
     * "https://docs.aws.amazon.com/systems-manager-automation-runbooks/latest/userguide/automation-awssupport-troubleshoot-managed-instance.html"
     * >https://docs.aws.amazon.com/systems-manager-automation-runbooks/latest/userguide/automation-awssupport-
     * troubleshoot-managed-instance.html</a>. Once the instance becomes managed by SSM, Inspector will automatically
     * begin scanning this instance.
     * </p>
     * <p>
     * <code>UNSUPPORTED_OS</code> - Amazon Inspector does not support this OS, architecture, or image manifest type at
     * this time. To see a complete list of supported operating systems see: <a
     * href=" https://docs.aws.amazon.com/inspector/latest/user/supported.html"
     * >https://docs.aws.amazon.com/inspector/latest/user/supported.html</a>.
     * </p>
     * <p>
     * <code>SCAN_ELIGIBILITY_EXPIRED</code> - The configured scan duration has lapsed for this image.
     * </p>
     * <p>
     * <code>RESOURCE_TERMINATED</code> - This resource has been terminated. The findings and coverage associated with
     * this resource are in the process of being cleaned up.
     * </p>
     * <p>
     * <code>SUCCESSFUL</code> - The scan was successful.
     * </p>
     * <p>
     * <code>NO_RESOURCES_FOUND</code> - Reserved for future use.
     * </p>
     * <p>
     * <code>IMAGE_SIZE_EXCEEDED</code> - Reserved for future use.
     * </p>
     * <p>
     * <code>SCAN_FREQUENCY_MANUAL</code> - This image will not be covered by Amazon Inspector due to the repository
     * scan frequency configuration.
     * </p>
     * <p>
     * <code>SCAN_FREQUENCY_SCAN_ON_PUSH </code>- This image will be scanned one time and will not new findings because
     * of the scan frequency configuration.
     * </p>
     * <p>
     * <code>EC2_INSTANCE_STOPPED</code> - This EC2 instance is in a stopped state, therefore, Amazon Inspector will
     * pause scanning. The existing findings will continue to exist until the instance is terminated. Once the instance
     * is re-started, Inspector will automatically start scanning the instance again. Please note that you will not be
     * charged for this instance while it’s in a stopped state.
     * </p>
     * <p>
     * <code>PENDING_DISABLE</code> - This resource is pending cleanup during disablement. The customer will not be
     * billed while a resource is in the pending disable status.
     * </p>
     * <p>
     * <code>NO INVENTORY</code> - Amazon Inspector couldn’t find software application inventory to scan for
     * vulnerabilities. This might be caused due to required Amazon Inspector associations being deleted or failing to
     * run on your resource. Please verify the status of <code>InspectorInventoryCollection-do-not-delete</code>
     * association in the SSM console for the resource. Additionally, you can verify the instance’s inventory in the SSM
     * Fleet Manager console.
     * </p>
     * <p>
     * <code>STALE_INVENTORY</code> - Amazon Inspector wasn’t able to collect an updated software application inventory
     * in the last 7 days. Please confirm the required Amazon Inspector associations still exist and you can still see
     * an updated inventory in the SSM console.
     * </p>
     * <p>
     * <code>EXCLUDED_BY_TAG</code> - This resource was not scanned because it has been excluded by a tag.
     * </p>
     * <p>
     * <code>UNSUPPORTED_RUNTIME</code> - The function was not scanned because it has an unsupported runtime. To see a
     * complete list of supported runtimes see: <a
     * href=" https://docs.aws.amazon.com/inspector/latest/user/supported.html"
     * >https://docs.aws.amazon.com/inspector/latest/user/supported.html</a>.
     * </p>
     * <p>
     * <code>UNSUPPORTED_MEDIA_TYPE </code>- The ECR image has an unsupported media type.
     * </p>
     * <p>
     * <code>UNSUPPORTED_CONFIG_FILE</code> - Reserved for future use.
     * </p>
     * <p>
     * <code>DEEP_INSPECTION_PACKAGE_COLLECTION_LIMIT_EXCEEDED</code> - The instance has exceeded the 5000 package limit
     * for Amazon Inspector Deep inspection. To resume Deep inspection for this instance you can try to adjust the
     * custom paths associated with the account.
     * </p>
     * <p>
     * <code>DEEP_INSPECTION_DAILY_SSM_INVENTORY_LIMIT_EXCEEDED</code> - The SSM agent couldn't send inventory to Amazon
     * Inspector because the SSM quota for Inventory data collected per instance per day has already been reached for
     * this instance.
     * </p>
     * <p>
     * <code>DEEP_INSPECTION_COLLECTION_TIME_LIMIT_EXCEEDED</code> - Amazon Inspector failed to extract the package
     * inventory because the package collection time exceeding the maximum threshold of 15 minutes.
     * </p>
     * <p>
     * <code>DEEP_INSPECTION_NO_INVENTORY</code> The Amazon Inspector plugin hasn't yet been able to collect an
     * inventory of packages for this instance. This is usually the result of a pending scan, however, if this status
     * persists after 6 hours, use SSM to ensure that the required Amazon Inspector associations exist and are running
     * for the instance.
     * </p>
     * <p/>
     * 
     * @param reason
     *        The scan status. Possible return values and descriptions are:
     *        </p>
     *        <p>
     *        <code>PENDING_INITIAL_SCAN</code> - This resource has been identified for scanning, results will be
     *        available soon.
     *        </p>
     *        <p>
     *        <code>ACCESS_DENIED</code> - Resource access policy restricting Amazon Inspector access. Please update the
     *        IAM policy.
     *        </p>
     *        <p>
     *        <code>INTERNAL_ERROR</code> - Amazon Inspector has encountered an internal error for this resource. Amazon
     *        Inspector service will automatically resolve the issue and resume the scanning. No action required from
     *        the user.
     *        </p>
     *        <p>
     *        <code>UNMANAGED_EC2_INSTANCE</code> - The EC2 instance is not managed by SSM, please use the following SSM
     *        automation to remediate the issue: <a href=
     *        "https://docs.aws.amazon.com/systems-manager-automation-runbooks/latest/userguide/automation-awssupport-troubleshoot-managed-instance.html"
     *        >https://docs.aws.amazon.com/systems-manager-automation-runbooks/latest/userguide/automation-awssupport-
     *        troubleshoot-managed-instance.html</a>. Once the instance becomes managed by SSM, Inspector will
     *        automatically begin scanning this instance.
     *        </p>
     *        <p>
     *        <code>UNSUPPORTED_OS</code> - Amazon Inspector does not support this OS, architecture, or image manifest
     *        type at this time. To see a complete list of supported operating systems see: <a
     *        href=" https://docs.aws.amazon.com/inspector/latest/user/supported.html"
     *        >https://docs.aws.amazon.com/inspector/latest/user/supported.html</a>.
     *        </p>
     *        <p>
     *        <code>SCAN_ELIGIBILITY_EXPIRED</code> - The configured scan duration has lapsed for this image.
     *        </p>
     *        <p>
     *        <code>RESOURCE_TERMINATED</code> - This resource has been terminated. The findings and coverage associated
     *        with this resource are in the process of being cleaned up.
     *        </p>
     *        <p>
     *        <code>SUCCESSFUL</code> - The scan was successful.
     *        </p>
     *        <p>
     *        <code>NO_RESOURCES_FOUND</code> - Reserved for future use.
     *        </p>
     *        <p>
     *        <code>IMAGE_SIZE_EXCEEDED</code> - Reserved for future use.
     *        </p>
     *        <p>
     *        <code>SCAN_FREQUENCY_MANUAL</code> - This image will not be covered by Amazon Inspector due to the
     *        repository scan frequency configuration.
     *        </p>
     *        <p>
     *        <code>SCAN_FREQUENCY_SCAN_ON_PUSH </code>- This image will be scanned one time and will not new findings
     *        because of the scan frequency configuration.
     *        </p>
     *        <p>
     *        <code>EC2_INSTANCE_STOPPED</code> - This EC2 instance is in a stopped state, therefore, Amazon Inspector
     *        will pause scanning. The existing findings will continue to exist until the instance is terminated. Once
     *        the instance is re-started, Inspector will automatically start scanning the instance again. Please note
     *        that you will not be charged for this instance while it’s in a stopped state.
     *        </p>
     *        <p>
     *        <code>PENDING_DISABLE</code> - This resource is pending cleanup during disablement. The customer will not
     *        be billed while a resource is in the pending disable status.
     *        </p>
     *        <p>
     *        <code>NO INVENTORY</code> - Amazon Inspector couldn’t find software application inventory to scan for
     *        vulnerabilities. This might be caused due to required Amazon Inspector associations being deleted or
     *        failing to run on your resource. Please verify the status of
     *        <code>InspectorInventoryCollection-do-not-delete</code> association in the SSM console for the resource.
     *        Additionally, you can verify the instance’s inventory in the SSM Fleet Manager console.
     *        </p>
     *        <p>
     *        <code>STALE_INVENTORY</code> - Amazon Inspector wasn’t able to collect an updated software application
     *        inventory in the last 7 days. Please confirm the required Amazon Inspector associations still exist and
     *        you can still see an updated inventory in the SSM console.
     *        </p>
     *        <p>
     *        <code>EXCLUDED_BY_TAG</code> - This resource was not scanned because it has been excluded by a tag.
     *        </p>
     *        <p>
     *        <code>UNSUPPORTED_RUNTIME</code> - The function was not scanned because it has an unsupported runtime. To
     *        see a complete list of supported runtimes see: <a
     *        href=" https://docs.aws.amazon.com/inspector/latest/user/supported.html"
     *        >https://docs.aws.amazon.com/inspector/latest/user/supported.html</a>.
     *        </p>
     *        <p>
     *        <code>UNSUPPORTED_MEDIA_TYPE </code>- The ECR image has an unsupported media type.
     *        </p>
     *        <p>
     *        <code>UNSUPPORTED_CONFIG_FILE</code> - Reserved for future use.
     *        </p>
     *        <p>
     *        <code>DEEP_INSPECTION_PACKAGE_COLLECTION_LIMIT_EXCEEDED</code> - The instance has exceeded the 5000
     *        package limit for Amazon Inspector Deep inspection. To resume Deep inspection for this instance you can
     *        try to adjust the custom paths associated with the account.
     *        </p>
     *        <p>
     *        <code>DEEP_INSPECTION_DAILY_SSM_INVENTORY_LIMIT_EXCEEDED</code> - The SSM agent couldn't send inventory to
     *        Amazon Inspector because the SSM quota for Inventory data collected per instance per day has already been
     *        reached for this instance.
     *        </p>
     *        <p>
     *        <code>DEEP_INSPECTION_COLLECTION_TIME_LIMIT_EXCEEDED</code> - Amazon Inspector failed to extract the
     *        package inventory because the package collection time exceeding the maximum threshold of 15 minutes.
     *        </p>
     *        <p>
     *        <code>DEEP_INSPECTION_NO_INVENTORY</code> The Amazon Inspector plugin hasn't yet been able to collect an
     *        inventory of packages for this instance. This is usually the result of a pending scan, however, if this
     *        status persists after 6 hours, use SSM to ensure that the required Amazon Inspector associations exist and
     *        are running for the instance.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanStatusReason
     */

    public ScanStatus withReason(ScanStatusReason reason) {
        this.reason = reason.toString();
        return this;
    }

    /**
     * <p>
     * The status code of the scan.
     * </p>
     * 
     * @param statusCode
     *        The status code of the scan.
     * @see ScanStatusCode
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The status code of the scan.
     * </p>
     * 
     * @return The status code of the scan.
     * @see ScanStatusCode
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The status code of the scan.
     * </p>
     * 
     * @param statusCode
     *        The status code of the scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanStatusCode
     */

    public ScanStatus withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * The status code of the scan.
     * </p>
     * 
     * @param statusCode
     *        The status code of the scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanStatusCode
     */

    public ScanStatus withStatusCode(ScanStatusCode statusCode) {
        this.statusCode = statusCode.toString();
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
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScanStatus == false)
            return false;
        ScanStatus other = (ScanStatus) obj;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        return hashCode;
    }

    @Override
    public ScanStatus clone() {
        try {
            return (ScanStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.ScanStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
