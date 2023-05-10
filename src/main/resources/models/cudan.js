// Import model Cudan
const Cudan = require('../models/cudan');

/**
 * Thêm một cư dân mới vào cơ sở dữ liệu
 * @param {object} cudanData - Thông tin cư dân mới
 * @returns {Promise<object>} Đối tượng cư dân được lưu
 */
async function themCudan(cudanData) {
    try {
        const cudan = new Cudan(cudanData);
        const savedCudan = await cudan.save();
        return savedCudan;
    } catch (error) {
        throw new Error(`Không thể thêm cư dân: ${error.message}`);
    }
}

/**
 * Cập nhật thông tin của một cư dân trong cơ sở dữ liệu
 * @param {string} cudanId - ID của cư dân cần cập nhật
 * @param {object} updatedCudanData - Thông tin cập nhật của cư dân
 * @returns {Promise<object>} Đối tượng cư dân đã được cập nhật
 */
async function capnhatCudan(cudanId, updatedCudanData) {
    try {
        const updatedCudan = await Cudan.findByIdAndUpdate(
            cudanId,
            updatedCudanData,
            { new: true }
        );
        if (!updatedCudan) {
            throw new Error('Không tìm thấy cư dân');
        }
        return updatedCudan;
    } catch (error) {
        throw new Error(`Không thể cập nhật cư dân: ${error.message}`);
    }
}

/**
 * Xóa một cư dân khỏi cơ sở dữ liệu
 * @param {string} cudanId - ID của cư dân cần xóa
 * @returns {Promise<void>} Promise resolve khi cư dân đã được xóa khỏi cơ sở dữ liệu
 */
async function xoaCudan(cudanId) {
    try {
        const deletedCudan = await Cudan.findByIdAndDelete(cudanId);
        if (!deletedCudan) {
            throw new Error('Không tìm thấy cư dân');
        }
    } catch (error) {
        throw new Error(`Không thể xóa cư dân: ${error.message}`);
    }
}

module.exports = { themCudan, capnhatCudan, xoaCudan };
