/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
    int minCameras(TreeNode* root, int level) {
        if (root == nullptr) {
            return 0;
        }
        if (root != nullptr && level == 0 && root->left == nullptr && root->right == nullptr) {
            return 1;
        }
        int cameras = 0;
        if (root->left != nullptr) {
            cameras += minCameras(root->left, level+1);
        }
        if (root->right != nullptr) {
            cameras += minCameras(root->left, level+1);
        }
        bool lcUnprotected = root->left != nullptr && root->left->val == 0;
        bool rcUnprotected = root->right != nullptr && root->right->val == 0;
        if (lcUnprotected || rcUnprotected) {
            cameras++;
            root->val = 1;
        }
        return cameras;
    }
    
    int minCameraCover(TreeNode* root) {
        minCameras(root,0);
    }
    
};
