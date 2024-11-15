public void addStudent(String name, String rollNumber, String course) {
    try (Connection con = DatabaseConnection.connect()) {
        String query = "INSERT INTO students (name, roll_number, course) VALUES (?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setString(1, name);
        stmt.setString(2, rollNumber);
        stmt.setString(3, course);
        stmt.executeUpdate();
        System.out.println("Student added successfully.");
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
