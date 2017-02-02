package com.amazonaws.services.s3.transfer;

import com.amazonaws.services.s3.model.ObjectTagging;

import java.io.File;

/**
 * This is the callback interface which is used by TransferManager.uploadDirectory and
 * TransferManager.uploadFileList. The callback is invoked for each file that is uploaded by
 * <code>TransferManager</code> and given an opportunity to specify the tags for each file.
 */
public interface ObjectTaggingProvider {

    /*This method is called for every file that is uploaded by <code>TransferManager</code>
     * and gives an opportunity to specify the metadata for the file.
     *
     * @param file
	 * 			The file being uploaded.
     *
     * @param tags
	 * 			The tags for the file. You can modify this object to specify
	 * your own tags.
	 */
    public void provideObjectTags(final File file, final ObjectTagging tags);
}
