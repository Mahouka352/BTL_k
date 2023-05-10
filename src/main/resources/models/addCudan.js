const mysql = require('mysql');

// Tạo kết nối tới MySQL
const connection = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: '025003',
    database: 'test'
});

// Kết nối tới MySQL
connection.connect((err) => {
    if (err) throw err;
    console.log('Kết nối thành công!');
});

// Thêm một cư dân mới vào database
const newCudan = { name: 'Nguyễn Văn A', age: 30, address: 'Hà Nội' };
connection.query('INSERT INTO cudan SET ?', newCudan, (error, results, fields) => {
    if (error) throw error;
    console.log('Thêm cư dân mới thành công!');
});

// Ngắt kết nối tới MySQL
connection.end((err) => {
    if (err) throw err;
    console.log('Ngắt kết nối thành công!');
});
